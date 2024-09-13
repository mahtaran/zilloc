package nl.utwente.smartspaces.zilloc.ui

import android.bluetooth.le.BluetoothLeScanner
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import nl.utwente.smartspaces.zilloc.data.EARTH_RADIUS
import nl.utwente.smartspaces.zilloc.data.ScannedDevice
import nl.utwente.smartspaces.zilloc.data.beacons
import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.time.TimeSource

class LocalisationViewModel : ViewModel() {
	private val timeSource = TimeSource.Monotonic

	private val _uiState = MutableStateFlow(LocalisationUiState(timeSource.markNow()))
	val uiState = _uiState.asStateFlow()

	fun updateBLEScanner(bluetoothLeScanner: BluetoothLeScanner) {
		_uiState.update { currentState ->
			currentState.copy(bluetoothLeScanner = bluetoothLeScanner)
		}
	}

	fun updateLocation(location: LatLng) {
		_uiState.update { currentState ->
			currentState.copy(
				lastLocation = location,
				lastUpdate = timeSource.markNow()
			)
		}
	}

	fun addScannedDevice(device: ScannedDevice) {
		beacons.find { it.mac == device.mac }?.let { beacon ->
			beacon.position?.let { position ->
				_uiState.update { currentState ->
					currentState.copy(
						scannedDevices = currentState.scannedDevices + Pair(
							position,
							device.distance
						)
					)
				}
			}

			if (uiState.value.scannedDevices.size >= 3) {
				trilaterate()
			}
		}
	}

	fun resetScannedDevices() {
		_uiState.update { currentState ->
			currentState.copy(scannedDevices = emptyList())
		}
	}

	private fun trilaterate() {
		val devices = uiState.value.scannedDevices.takeLast(3)
		val positions = devices.map { geodeticToCartesian(it.first) }
		val distances = devices.map { it.second }

		val position = trilaterate(positions, distances)
		updateLocation(position)
	}

	private fun trilaterate(
		positions: List<Triple<Double, Double, Double>>,
		distances: List<Double>
	): LatLng {
		val p1 = positions[0]
		val p2 = positions[1]
		val p3 = positions[2]

		val d1 = distances[0]
		val d2 = distances[1]
		val d3 = distances[2]

		val ex = (p2 - p1) / (p2 - p1).norm()
		val i = ex.dot(p3 - p1)
		val ey = (p3 - p1 - i * ex) / (p3 - p1 - i * ex).norm()
		val ez = ex.cross(ey)
		val d = (p2 - p1).norm()
		val j = ey.dot(p3 - p1)

		val x = (d1.pow(2) - d2.pow(2) + d.pow(2)) / (2 * d)
		val y = (d1.pow(2) - d3.pow(2) + i.pow(2) + j.pow(2)) / (2 * j) - i / j * x
		val z = sqrt(d1.pow(2) - x.pow(2) - y.pow(2))

		val triPt = p1 + x * ex + y * ey + z * ez

		return cartesianToGeodetic(triPt)
	}

	private fun geodeticToCartesian(location: LatLng): Triple<Double, Double, Double> {
		val latitude = Math.toRadians(location.latitude)
		val longitude = Math.toRadians(location.longitude)

		val x = EARTH_RADIUS * cos(longitude) * cos(latitude)
		val y = EARTH_RADIUS * sin(longitude) * cos(latitude)
		val z = EARTH_RADIUS * sin(latitude)

		return Triple(x, y, z)
	}

	private fun cartesianToGeodetic(position: Triple<Double, Double, Double>): LatLng {
		val latitude = Math.toDegrees(asin(position.third / EARTH_RADIUS))
		val longitude = Math.toDegrees(atan2(position.second, position.first))

		return LatLng(latitude, longitude)
	}

	private operator fun Triple<Double, Double, Double>.plus(other: Triple<Double, Double, Double>): Triple<Double, Double, Double> {
		return Triple(
			this.first + other.first,
			this.second + other.second,
			this.third + other.third
		)
	}

	private operator fun Triple<Double, Double, Double>.minus(other: Triple<Double, Double, Double>): Triple<Double, Double, Double> {
		return Triple(
			this.first - other.first,
			this.second - other.second,
			this.third - other.third
		)
	}

	private operator fun Double.times(other: Triple<Double, Double, Double>): Triple<Double, Double, Double> {
		return Triple(
			this * other.first,
			this * other.second,
			this * other.third
		)
	}

	private operator fun Triple<Double, Double, Double>.div(other: Double): Triple<Double, Double, Double> {
		return Triple(
			this.first / other,
			this.second / other,
			this.third / other
		)
	}

	private fun Triple<Double, Double, Double>.norm(): Double {
		return sqrt(this.first.pow(2) + this.second.pow(2) + this.third.pow(2))
	}

	private fun Triple<Double, Double, Double>.dot(other: Triple<Double, Double, Double>): Double {
		return this.first * other.first + this.second * other.second + this.third * other.third
	}

	private fun Triple<Double, Double, Double>.cross(other: Triple<Double, Double, Double>): Triple<Double, Double, Double> {
		return Triple(
			this.second * other.third - this.third * other.second,
			this.third * other.first - this.first * other.third,
			this.first * other.second - this.second * other.first
		)
	}
}
