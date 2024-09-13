package nl.utwente.smartspaces.zilloc.data

import android.net.MacAddress
import com.google.android.gms.maps.model.LatLng

val beacons = listOf(
	Beacon(
		147,
		MacAddress.fromString("C2:8F:DF:51:4E:AF"),
		LatLng(52.23923, 6.85650),
		Room.Zilverling_5013
	),
	Beacon(
		112,
		MacAddress.fromString("C4:31:75:59:D3:FA"),
		null,
		null
	),
	Beacon(
		118,
		MacAddress.fromString("C7:75:AB:1D:6A:DE"),
		LatLng(52.23924, 6.85647),
		Room.Zilverling_5011
	),
	Beacon(
		113,
		MacAddress.fromString("C9:1E:7D:BD:75:53"),
		LatLng(52.23930, 6.85631),
		Room.Zilverling_5003
	),
	Beacon(
		102,
		MacAddress.fromString("CA:02:32:D2:A1:83"),
		LatLng(52.23937, 6.85630),
		Room.Zilverling_5002
	),
	Beacon(
		106,
		MacAddress.fromString("CB:23:BF:8F:F5:5A"),
		LatLng(52.23939, 6.85633),
		Room.Zilverling_5006
	),
	Beacon(
		96073,
		MacAddress.fromString("CD:79:35:3F:C3:8B"),
		null,
		null
	),
	Beacon(
		53530,
		MacAddress.fromString("D0:2A:B7:EC:6C:44"),
		LatLng(52.23927, 6.85639),
		Room.Zilverling_5007
	),
	Beacon(
		95581,
		MacAddress.fromString("D2:FD:9D:13:ED:6B"),
		null,
		null
	),
	Beacon(
		123,
		MacAddress.fromString("D3:D8:22:EE:40:90"),
		LatLng(52.23935, 6.85625),
		Room.Zilverling_5001
	),
	Beacon(
		121,
		MacAddress.fromString("D4:50:EF:62:52:77"),
		null,
		null
	),
	Beacon(
		53720,
		MacAddress.fromString("D6:CA:74:F4:6F:BB"),
		LatLng(52.23929, 6.85635),
		Room.Zilverling_5005
	),
	Beacon(
		117,
		MacAddress.fromString("D9:03:E3:29:67:B1"),
		null,
		null
	),
	Beacon(
		53717,
		MacAddress.fromString("DD:E2:E3:22:2C:27"),
		LatLng(52.23921, 6.85654),
		Room.Zilverling_5015
	),
	Beacon(
		146,
		MacAddress.fromString("DE:A7:4A:B9:AC:6A"),
		LatLng(52.23937, 6.85637),
		Room.Zilverling_5006
	),
	Beacon(
		53721,
		MacAddress.fromString("DE:AE:F9:8E:93:1D"),
		LatLng(52.23935, 6.85642),
		Room.Zilverling_5010
	),
	Beacon(
		109,
		MacAddress.fromString("DF:27:CE:FD:A5:50"),
		null,
		null
	),
	Beacon(
		104,
		MacAddress.fromString("E0:DF:98:16:0C:75"),
		null,
		null
	),
	Beacon(
		53511,
		MacAddress.fromString("E0:FF:2E:68:5A:BF"),
		null,
		null
	),
	Beacon(
		53516,
		MacAddress.fromString("E1:11:5E:46:41:31"),
		LatLng(52.23934, 6.85646),
		Room.Zilverling_5016
	),
	Beacon(
		53719,
		MacAddress.fromString("E4:AC:6D:E6:77:7A"),
		null,
		null
	),
	Beacon(
		95580,
		MacAddress.fromString("E4:D7:BA:CB:2C:F8"),
		LatLng(52.23927, 6.85663),
		Room.Zilverling_5034
	),
	Beacon(
		53515,
		MacAddress.fromString("E7:97:7E:48:E3:F1"),
		LatLng(52.23926, 6.85643),
		Room.Zilverling_5009
	),
	Beacon(
		101,
		MacAddress.fromString("E8:9E:C6:63:9A:A6"),
		null,
		null
	),
	Beacon(
		97,
		MacAddress.fromString("E8:A2:B4:20:10:AA"),
		null,
		null
	),
	Beacon(
		53512,
		MacAddress.fromString("E8:FD:27:B7:8B:D5"),
		null,
		null
	),
	Beacon(
		95583,
		MacAddress.fromString("E8:FF:61:EE:EE:A6"),
		LatLng(52.23930, 6.85659),
		Room.Zilverling_5022
	),
	Beacon(
		103,
		MacAddress.fromString("E9:79:FC:4C:5E:77"),
		LatLng(52.23916, 6.85669),
		Room.Zilverling_5023
	),
	Beacon(
		96077,
		MacAddress.fromString("ED:E3:26:AF:5C:FE"),
		null,
		null
	),
	Beacon(
		132,
		MacAddress.fromString("F8:DE:B9:18:55:ED"),
		LatLng(52.23928, 6.85661),
		Room.Zilverling_5032
	),
	Beacon(
		95582,
		MacAddress.fromString("F9:78:1E:47:54:B7"),
		null,
		null
	),
	Beacon(
		110,
		MacAddress.fromString("FC:00:55:AC:AE:12"),
		LatLng(52.23932, 6.85651),
		Room.Zilverling_5022
	)
)

val antennas = mapOf(
	"A" to listOf(
		MacAddress.fromString("D7:08:44:3C:7F:09"),
		MacAddress.fromString("EC:1C:37:B5:B4:4F"),
		MacAddress.fromString("EB:A2:1B:CE:31:EC"),
		MacAddress.fromString("DE:AC:E4:81:12:D6"),
		MacAddress.fromString("F9:B0:44:14:19:F9"),
		MacAddress.fromString("D6:12:35:99:CA:17"),
		MacAddress.fromString("C1:6F:31:CF:3E:6D"),
		MacAddress.fromString("EA:64:7A:3A:35:75")
	),
	"B" to listOf(
		MacAddress.fromString("D5:88:79:6F:9C:44"),
		MacAddress.fromString("CF:3E:A2:5B:33:65"),
		MacAddress.fromString("F7:D6:23:D0:DF:24"),
		MacAddress.fromString("E5:CD:CB:19:D3:17"),
		MacAddress.fromString("CB:94:11:47:A9:1F"),
		MacAddress.fromString("D5:19:64:B9:E6:F6"),
		MacAddress.fromString("C8:45:AE:31:6A:C1"),
		MacAddress.fromString("FC:24:C2:3D:D5:2A")
	),
	"E" to listOf(
		MacAddress.fromString("D1:7A:C8:8C:21:2D"),
		MacAddress.fromString("F5:FC:EB:45:73:20"),
		MacAddress.fromString("F1:D6:E6:73:C9:B8"),
		MacAddress.fromString("DD:D3:F4:8B:FB:3F"),
		MacAddress.fromString("CF:1D:6C:3F:DE:38"),
		MacAddress.fromString("E0:24:97:61:17:5C"),
		MacAddress.fromString("C0:A9:2E:0F:6B:40"),
		MacAddress.fromString("F7:65:2D:7A:F4:A0")
	)
)

