package nl.utwente.smartspaces.zilloc.data

import com.google.android.gms.maps.model.LatLng
import kotlin.time.Duration.Companion.seconds

val DEFAULT_LOCATION = LatLng(52.23928, 6.85645)
val SCANNING_PERIOD = 10.seconds

const val SHADING_DISTANCE_NORMALISATION = 6.3774E-4
const val SHADING_FALLOFF = 8
const val SHADING_INTENSITY = 0.4

const val ENABLE_POSITION_SLIDERS = true
const val ENABLE_POSITION_MARKER = true
const val ENABLE_ROOM_SHADING = true
const val ENABLE_BEACON_MARKING = false

const val EARTH_RADIUS = 6_371_000.0
