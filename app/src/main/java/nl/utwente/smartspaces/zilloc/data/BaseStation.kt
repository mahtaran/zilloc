package nl.utwente.smartspaces.zilloc.data

import android.net.MacAddress
import com.google.android.gms.maps.model.LatLng

data class BaseStation(
	val id: Int,
	val name: String,
	val mac: MacAddress,
	val position: LatLng,
	val floor: Int,
)
