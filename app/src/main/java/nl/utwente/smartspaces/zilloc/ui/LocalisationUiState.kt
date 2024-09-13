package nl.utwente.smartspaces.zilloc.ui

import android.bluetooth.le.BluetoothLeScanner
import com.google.android.gms.maps.model.LatLng
import nl.utwente.smartspaces.zilloc.data.DEFAULT_LOCATION
import kotlin.time.ComparableTimeMark

data class LocalisationUiState(
	val lastUpdate: ComparableTimeMark,
	val lastLocation: LatLng = DEFAULT_LOCATION,
	val bluetoothLeScanner: BluetoothLeScanner? = null,
	val scannedDevices: List<Pair<LatLng, Double>> = emptyList()
)
