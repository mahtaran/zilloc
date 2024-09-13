package nl.utwente.smartspaces.zilloc.data

import android.net.MacAddress
import com.google.android.gms.maps.model.LatLng

data class Beacon(
	val id: Int,
	val mac: MacAddress,
	val position: LatLng?,
	val room: Room?,
) {
	val name
		get() = "Beacon_$id"
}
