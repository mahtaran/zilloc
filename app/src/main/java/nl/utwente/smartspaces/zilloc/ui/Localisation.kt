package nl.utwente.smartspaces.zilloc.ui

import android.Manifest
import android.bluetooth.BluetoothManager
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Context
import android.content.res.Configuration
import android.net.MacAddress
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polygon
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import nl.utwente.smartspaces.zilloc.data.DEFAULT_LOCATION
import nl.utwente.smartspaces.zilloc.data.ENABLE_BEACON_MARKING
import nl.utwente.smartspaces.zilloc.data.ENABLE_POSITION_MARKER
import nl.utwente.smartspaces.zilloc.data.ENABLE_POSITION_SLIDERS
import nl.utwente.smartspaces.zilloc.data.ENABLE_ROOM_SHADING
import nl.utwente.smartspaces.zilloc.data.Room
import nl.utwente.smartspaces.zilloc.data.SCANNING_PERIOD
import nl.utwente.smartspaces.zilloc.data.ScannedDevice
import nl.utwente.smartspaces.zilloc.data.beacons

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun Localisation(
	padding: PaddingValues,
	viewModel: LocalisationViewModel = viewModel()
) {
	val context = LocalContext.current
	val configuration = LocalConfiguration.current

	val permissionState = rememberMultiplePermissionsState(
		listOf(
			Manifest.permission.ACCESS_COARSE_LOCATION,
			Manifest.permission.ACCESS_FINE_LOCATION,
			Manifest.permission.BLUETOOTH_SCAN
		)
	)

	val bluetoothManager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
	viewModel.updateBLEScanner(bluetoothManager.adapter.bluetoothLeScanner)

	if (permissionState.allPermissionsGranted) {
		when (configuration.orientation) {
			Configuration.ORIENTATION_PORTRAIT -> {
				Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
					Scanner(
						modifier = Modifier
							.fillMaxWidth()
							.requiredHeight(96.dp)
					)
					Map(
						padding = padding,
						modifier = Modifier.fillMaxHeight()
					)
				}
			}

			Configuration.ORIENTATION_LANDSCAPE -> {
				Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
					Scanner(
						modifier = Modifier.weight(1f)
					)
					Map(
						padding = padding,
						modifier = Modifier.weight(5f)
					)
				}
			}

			else -> {
				Text(
					text = "Unsupported orientation",
					textAlign = TextAlign.Center
				)
			}
		}
	} else {
		Column(
			modifier = Modifier
				.padding(32.dp)
				.fillMaxSize()
				.wrapContentHeight(),
			horizontalAlignment = Alignment.CenterHorizontally,
			verticalArrangement = Arrangement.spacedBy(16.dp)
		) {
			Text(
				text = "Location and Bluetooth permissions are needed to localise your device",
				textAlign = TextAlign.Center
			)
			Button(
				onClick = { permissionState.launchMultiplePermissionRequest() }
			) {
				Text("Request permission")
			}
		}
	}
}

@Composable
fun Scanner(
	modifier: Modifier = Modifier.fillMaxSize(),
	viewModel: LocalisationViewModel = viewModel()
) {
	val uiState by viewModel.uiState.collectAsState()

	val scope = rememberCoroutineScope()
	var scanning by remember { mutableStateOf(false) }

	val scanCallback = object : ScanCallback() {
		override fun onScanResult(callbackType: Int, result: ScanResult?) {
			result?.let {
				viewModel.addScannedDevice(
					ScannedDevice(
						mac = MacAddress.fromString(it.device.address),
						rssi = it.rssi
					)
				)
			}
		}

		override fun onBatchScanResults(results: List<ScanResult?>) {
			results.filterNotNull().forEach {
				viewModel.addScannedDevice(
					ScannedDevice(
						mac = MacAddress.fromString(it.device.address),
						rssi = it.rssi,
					)
				)
			}
		}
	}

	Column(
		modifier = modifier,
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Bottom
	) {
		Button(
			onClick = {
				if (!scanning) {
					viewModel.resetScannedDevices()
					uiState.bluetoothLeScanner?.startScan(scanCallback)
					scanning = true

					scope.launch {
						delay(SCANNING_PERIOD)
						uiState.bluetoothLeScanner?.stopScan(scanCallback)
						scanning = false
					}
				} else {
					uiState.bluetoothLeScanner?.stopScan(scanCallback)
					scanning = false
				}
			}
		) {
			Text(text = if (scanning) "Stop scanning" else "Start scanning")
		}
	}
}

@Composable
fun Map(
	padding: PaddingValues,
	modifier: Modifier = Modifier.fillMaxSize(),
	viewModel: LocalisationViewModel = viewModel()
) {
	val uiState by viewModel.uiState.collectAsState()

	val cameraPositionState = rememberCameraPositionState {
		position = CameraPosition.fromLatLngZoom(DEFAULT_LOCATION, 20f)
	}

	Column(
		modifier = modifier
	) {
		GoogleMap(
			modifier = Modifier.weight(4f),
			cameraPositionState = cameraPositionState,
			contentPadding = padding,
			properties = MapProperties(
				mapType = MapType.NORMAL,
				isMyLocationEnabled = true,
				isIndoorEnabled = true
			),
			uiSettings = MapUiSettings(
				mapToolbarEnabled = false,
				myLocationButtonEnabled = false,
				zoomControlsEnabled = false
			)
		) {
			if (ENABLE_BEACON_MARKING) {
				beacons.filter { it.position != null }.forEach { beacon ->
					Marker(
						MarkerState.invoke(beacon.position!!),
						title = beacon.name
					)
				}
			}

			if (ENABLE_ROOM_SHADING) {
				Room.entries.filterNot { it.points.isEmpty() }.forEach { room ->
					Polygon(
						points = room.points,
						fillColor = Color.Black.copy(
							alpha = room.shade(uiState.lastLocation).toFloat()
						),
						strokeWidth = 2f
					)
				}
			}

			if (ENABLE_POSITION_MARKER) {
				Marker(
					MarkerState.invoke(uiState.lastLocation),
					title = "You are here"
				)
			}
		}

		if (ENABLE_POSITION_SLIDERS) {
			Column(
				modifier = Modifier.weight(1f),
				verticalArrangement = Arrangement.spacedBy(8.dp),
			) {
				Slider(
					value = uiState.lastLocation.latitude.toFloat(),
					onValueChange = {
						viewModel.updateLocation(
							LatLng(
								it.toDouble(),
								viewModel.uiState.value.lastLocation.longitude
							)
						)
					},
					valueRange = DEFAULT_LOCATION.latitude.toFloat().rangeAround(0.00015f),
					modifier = Modifier.weight(3f)
				)
				Slider(
					value = uiState.lastLocation.longitude.toFloat(),
					onValueChange = {
						viewModel.updateLocation(
							LatLng(
								viewModel.uiState.value.lastLocation.latitude,
								it.toDouble()
							)
						)
					},
					valueRange = DEFAULT_LOCATION.longitude.toFloat().rangeAround(0.0003f),
					modifier = Modifier.weight(3f)
				)
			}
		}
	}
}

fun Float.rangeAround(delta: Float): ClosedFloatingPointRange<Float> {
	return this - delta..this + delta
}
