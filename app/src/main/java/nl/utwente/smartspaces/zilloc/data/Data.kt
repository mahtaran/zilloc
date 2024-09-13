package nl.utwente.smartspaces.zilloc.data

import android.net.MacAddress
import com.google.android.gms.maps.model.LatLng

val beacons = listOf(
	Beacon(
		147, MacAddress.fromString("C2:8F:DF:51:4E:AF"),
		LatLng(52.23923, 6.85650), Room.Zilverling_5013
	),
	Beacon(
		112, MacAddress.fromString("C4:31:75:59:D3:FA"),
		null, null
	),
	Beacon(
		118, MacAddress.fromString("C7:75:AB:1D:6A:DE"),
		LatLng(52.23924, 6.85647), Room.Zilverling_5011
	),
	Beacon(
		113, MacAddress.fromString("C9:1E:7D:BD:75:53"),
		LatLng(52.23930, 6.85631), Room.Zilverling_5003
	),
	Beacon(
		102, MacAddress.fromString("CA:02:32:D2:A1:83"),
		LatLng(52.23937, 6.85630), Room.Zilverling_5002
	),
	Beacon(
		106, MacAddress.fromString("CB:23:BF:8F:F5:5A"),
		LatLng(52.23939, 6.85633), Room.Zilverling_5006
	),
	Beacon(
		96073, MacAddress.fromString("CD:79:35:3F:C3:8B"),
		null, null
	),
	Beacon(
		53530, MacAddress.fromString("D0:2A:B7:EC:6C:44"),
		LatLng(52.23927, 6.85639), Room.Zilverling_5007
	),
	Beacon(
		95581, MacAddress.fromString("D2:FD:9D:13:ED:6B"),
		null, null
	),
	Beacon(
		123, MacAddress.fromString("D3:D8:22:EE:40:90"),
		LatLng(52.23935, 6.85625), Room.Zilverling_5001
	),
	Beacon(
		121, MacAddress.fromString("D4:50:EF:62:52:77"),
		null, null
	),
	Beacon(
		53720, MacAddress.fromString("D6:CA:74:F4:6F:BB"),
		LatLng(52.23929, 6.85635), Room.Zilverling_5005
	),
	Beacon(
		117, MacAddress.fromString("D9:03:E3:29:67:B1"),
		null, null
	),
	Beacon(
		53717, MacAddress.fromString("DD:E2:E3:22:2C:27"),
		LatLng(52.23921, 6.85654), Room.Zilverling_5015
	),
	Beacon(
		146, MacAddress.fromString("DE:A7:4A:B9:AC:6A"),
		LatLng(52.23937, 6.85637), Room.Zilverling_5006
	),
	Beacon(
		53721, MacAddress.fromString("DE:AE:F9:8E:93:1D"),
		LatLng(52.23935, 6.85642), Room.Zilverling_5010
	),
	Beacon(
		109, MacAddress.fromString("DF:27:CE:FD:A5:50"),
		null, null
	),
	Beacon(
		104, MacAddress.fromString("E0:DF:98:16:0C:75"),
		null, null
	),
	Beacon(
		53511, MacAddress.fromString("E0:FF:2E:68:5A:BF"),
		null, null
	),
	Beacon(
		53516, MacAddress.fromString("E1:11:5E:46:41:31"),
		LatLng(52.23934, 6.85646), Room.Zilverling_5016
	),
	Beacon(
		53719, MacAddress.fromString("E4:AC:6D:E6:77:7A"),
		null, null
	),
	Beacon(
		95580, MacAddress.fromString("E4:D7:BA:CB:2C:F8"),
		LatLng(52.23927, 6.85663), Room.Zilverling_5034
	),
	Beacon(
		53515, MacAddress.fromString("E7:97:7E:48:E3:F1"),
		LatLng(52.23926, 6.85643), Room.Zilverling_5009
	),
	Beacon(
		101, MacAddress.fromString("E8:9E:C6:63:9A:A6"),
		null, null
	),
	Beacon(
		97, MacAddress.fromString("E8:A2:B4:20:10:AA"),
		null, null
	),
	Beacon(
		53512, MacAddress.fromString("E8:FD:27:B7:8B:D5"),
		null, null
	),
	Beacon(
		95583, MacAddress.fromString("E8:FF:61:EE:EE:A6"),
		LatLng(52.23930, 6.85659), Room.Zilverling_5022
	),
	Beacon(
		103, MacAddress.fromString("E9:79:FC:4C:5E:77"),
		LatLng(52.23916, 6.85669), Room.Zilverling_5023
	),
	Beacon(
		96077, MacAddress.fromString("ED:E3:26:AF:5C:FE"),
		null, null
	),
	Beacon(
		132, MacAddress.fromString("F8:DE:B9:18:55:ED"),
		LatLng(52.23928, 6.85661), Room.Zilverling_5032
	),
	Beacon(
		95582, MacAddress.fromString("F9:78:1E:47:54:B7"),
		null, null
	),
	Beacon(
		110, MacAddress.fromString("FC:00:55:AC:AE:12"),
		LatLng(52.23932, 6.85651), Room.Zilverling_5022
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

val baseStations = listOf(
	BaseStation(
		403, "UTB1_1213_293", MacAddress.fromString("f1:a6:a4:76:14:a5"),
		LatLng(52.2394526089864, 6.85535541841856), 5
	),
	BaseStation(
		438, "UTB1_1213_153", MacAddress.fromString("e6:b2:cb:4e:ac:06"),
		LatLng(52.2391354480207, 6.85569912731384), 4
	),
	BaseStation(
		532, "UTB1_1213_39", MacAddress.fromString("dd:82:3b:bf:80:8e"),
		LatLng(52.239456030275, 6.85526870402373), 4
	),
	BaseStation(
		525, "UTB1_1213_36", MacAddress.fromString("fa:88:41:62:4c:2d"),
		LatLng(52.2396323109598, 6.85609308118115), 1
	),
	BaseStation(
		414, "UTB1_1213_42", MacAddress.fromString("d0:20:5d:ca:96:14"),
		LatLng(52.2396057289736, 6.85616945905531), 1
	),
	BaseStation(
		380, "UTB1_1213_128", MacAddress.fromString("c5:8e:8e:75:24:52"),
		LatLng(52.2393706625001, 6.85533796848978), 1
	),
	BaseStation(
		480, "UTB1_1213_235", MacAddress.fromString("c1:7a:a6:f8:5e:43"),
		LatLng(52.2391099814784, 6.85542651580727), 1
	),
	BaseStation(
		458, "UTB1_1213_213", MacAddress.fromString("e2:83:81:47:2c:be"),
		LatLng(52.2390592248589, 6.85552713639587), 2
	),
	BaseStation(
		404, "UTB1_1213_288", MacAddress.fromString("c4:b6:ea:be:c9:95"),
		LatLng(52.2390874060649, 6.85554955448586), 4
	),
	BaseStation(
		405, "UTB1_1213_240", MacAddress.fromString("c0:57:ea:07:e5:60"),
		LatLng(52.239057316001, 6.85562334110011), 4
	),
	BaseStation(
		551, "UTB1_1213_94", MacAddress.fromString("e7:b5:2e:21:55:65"),
		LatLng(52.2396046326055, 6.85606550489634), 4
	),
	BaseStation(
		546, "UTB1_1213_155", MacAddress.fromString("ee:70:a9:48:23:9a"),
		LatLng(52.239577962161, 6.85614447136422), 4
	),
	BaseStation(
		539, "UTB1_1213_90", MacAddress.fromString("cd:f4:53:01:85:6f"),
		LatLng(52.2395780934508, 6.85613895033732), 5
	),
	BaseStation(
		543, "UTB1_1213_168", MacAddress.fromString("f5:0a:aa:8f:49:0f"),
		LatLng(52.2390872893093, 6.85554795177575), 5
	),
	BaseStation(
		550, "UTB1_1213_43", MacAddress.fromString("e2:23:a4:28:1b:d8"),
		LatLng(52.2393941378542, 6.8558537611456), 3
	),
	BaseStation(
		527, "UTB1_1213_29", MacAddress.fromString("fd:ec:87:be:0d:3b"),
		LatLng(52.239577015742, 6.85613556862624), 2
	),
	BaseStation(
		529, "UTB1_1213_28", MacAddress.fromString("ce:97:cc:07:99:2b"),
		LatLng(52.2394525520861, 6.85525337205694), 2
	),
	BaseStation(
		547, "UTB1_1213_162", MacAddress.fromString("c2:18:61:d0:1c:ce"),
		LatLng(52.2393711598996, 6.85524382105754), 2
	),
	BaseStation(
		520, "UTB1_1213_251", MacAddress.fromString("e0:d8:5c:4e:3b:bc"),
		LatLng(52.2395451863225, 6.85555627864586), 2
	),
	BaseStation(
		552, "UTB1_1213_37", MacAddress.fromString("fb:eb:d2:ac:be:80"),
		LatLng(52.2395466557542, 6.85600669958344), 3
	),
	BaseStation(
		554, "UTB1_1213_96", MacAddress.fromString("d5:96:4e:f3:72:28"),
		LatLng(52.239162659294, 6.8556254743521), 3
	),
	BaseStation(
		535, "UTB1_1213_93", MacAddress.fromString("ee:4c:e4:1a:63:00"),
		LatLng(52.2391995925345, 6.85556509230451), 1
	),
	BaseStation(
		453, "UTB1_1213_184", MacAddress.fromString("c5:aa:45:71:a9:aa"),
		LatLng(52.2393898303207, 6.85542013475971), 1
	),
	BaseStation(
		538, "UTB1_1213_82", MacAddress.fromString("fe:17:c6:d9:3c:a4"),
		LatLng(52.2392900989158, 6.85541221388657), 1
	),
	BaseStation(
		540, "UTB1_1213_99", MacAddress.fromString("cc:06:10:a9:34:42"),
		LatLng(52.239481777356, 6.85542913077355), 1
	),
	BaseStation(
		536, "UTB1_1213_91", MacAddress.fromString("d6:f1:57:0d:96:c3"),
		LatLng(52.2394643234612, 6.85570046471533), 1
	),
	BaseStation(
		537, "UTB1_1213_83", MacAddress.fromString("ed:cd:09:90:aa:c1"),
		LatLng(52.2392866715757, 6.85564716985161), 1
	),
	BaseStation(
		534, "UTB1_1213_100", MacAddress.fromString("ff:5c:d2:2e:d0:45"),
		LatLng(52.239500605106, 6.85567053657878), 2
	),
	BaseStation(
		544, "UTB1_1213_167", MacAddress.fromString("f1:82:f2:25:83:38"),
		LatLng(52.2392150534178, 6.85577660500626), 5
	),
	BaseStation(
		548, "UTB1_1213_161", MacAddress.fromString("c0:67:de:9e:ec:27"),
		LatLng(52.2394505938879, 6.85591306141483), 5
	),
	BaseStation(
		448, "UTB1_1213_192", MacAddress.fromString("d7:0f:fe:e3:84:a2"),
		LatLng(52.2394386515091, 6.85549895377962), 1
	),
	BaseStation(
		545, "UTB1_1213_163", MacAddress.fromString("d6:8c:ad:3a:c5:5b"),
		LatLng(52.2393619141967, 6.85533688677072), 5
	),
	BaseStation(
		449, "UTB1_1213_175", MacAddress.fromString("ea:9f:04:5f:08:26"),
		LatLng(52.2393563572923, 6.85572337214171), 1
	),
	BaseStation(
		450, "UTB1_1213_179", MacAddress.fromString("dc:a9:e2:71:c8:30"),
		LatLng(52.2394221285166, 6.85557061185485), 1
	),
	BaseStation(
		425, "UTB1_1213_274", MacAddress.fromString("eb:fa:f3:ce:5b:71"),
		LatLng(52.2394898255492, 6.85595488633244), 2
	),
	BaseStation(
		427, "UTB1_1213_275", MacAddress.fromString("cd:5e:c3:70:3e:77"),
		LatLng(52.2395629194688, 6.85555342975613), 2
	),
	BaseStation(
		429, "UTB1_1213_260", MacAddress.fromString("c7:56:8d:ed:a8:04"),
		LatLng(52.2393161707829, 6.8557778686956), 2
	),
	BaseStation(
		430, "UTB1_1213_277", MacAddress.fromString("eb:32:18:c0:2e:0d"),
		LatLng(52.2392790116646, 6.8552337533908), 2
	),
	BaseStation(
		463, "UTB1_1213_197", MacAddress.fromString("d2:e5:f8:aa:b9:a8"),
		LatLng(52.2392963813404, 6.85532323293735), 2
	),
	BaseStation(
		465, "UTB1_1213_198", MacAddress.fromString("ee:79:08:1d:ed:a3"),
		LatLng(52.2392478685057, 6.85571124638942), 2
	),
	BaseStation(
		478, "UTB1_1213_57", MacAddress.fromString("d6:50:2c:57:03:42"),
		LatLng(52.2391847788471, 6.85531064518781), 2
	),
	BaseStation(
		505, "UTB1_1213_236", MacAddress.fromString("c8:61:5d:4a:39:7d"),
		LatLng(52.2394606955553, 6.85602375453021), 2
	),
	BaseStation(
		509, "UTB1_1213_238", MacAddress.fromString("eb:44:e8:64:6e:33"),
		LatLng(52.2395184635576, 6.85607982735247), 2
	),
	BaseStation(
		491, "UTB1_1213_297", MacAddress.fromString("f0:8d:08:33:2a:05"),
		LatLng(52.2395766477599, 6.85613490573103), 3
	),
	BaseStation(
		492, "UTB1_1213_295", MacAddress.fromString("d6:80:ce:30:96:11"),
		LatLng(52.2393631354486, 6.85580510693981), 3
	),
	BaseStation(
		497, "UTB1_1213_87", MacAddress.fromString("d7:60:87:1d:ae:c9"),
		LatLng(52.2393915833508, 6.85571275454771), 3
	),
	BaseStation(
		493, "UTB1_1213_9", MacAddress.fromString("d5:1d:3d:ba:06:e8"),
		LatLng(52.2395412543518, 6.85535670451388), 2
	),
	BaseStation(
		392, "UTB1_1213_202", MacAddress.fromString("fa:fd:f5:3a:e8:61"),
		LatLng(52.239355692529, 6.85524065741478), 3
	),
	BaseStation(
		408, "UTB1_1213_41", MacAddress.fromString("ef:22:4f:a4:18:ae"),
		LatLng(52.2393502255298, 6.85533639263588), 3
	),
	BaseStation(
		411, "UTB1_1213_51", MacAddress.fromString("c8:c2:37:5f:8c:92"),
		LatLng(52.2392627991812, 6.85531702977218), 3
	),
	BaseStation(
		474, "UTB1_1213_67", MacAddress.fromString("cb:36:ac:01:90:85"),
		LatLng(52.2394731140311, 6.85550214545594), 3
	),
	BaseStation(
		476, "UTB1_1213_55", MacAddress.fromString("fd:e8:1f:85:c6:87"),
		LatLng(52.2396051302038, 6.8560660670386), 3
	),
	BaseStation(
		479, "UTB1_1213_244", MacAddress.fromString("ed:68:73:1f:38:43"),
		LatLng(52.2392699643051, 6.85583505226168), 3
	),
	BaseStation(
		481, "UTB1_1213_237", MacAddress.fromString("db:d4:c3:a8:e5:e3"),
		LatLng(52.2392017312407, 6.85539391377921), 3
	),
	BaseStation(
		483, "UTB1_1213_254", MacAddress.fromString("c6:7e:4d:6e:c7:ab"),
		LatLng(52.2390575517952, 6.85562335938044), 3
	),
	BaseStation(
		484, "UTB1_1213_255", MacAddress.fromString("e9:92:0f:f8:7b:ce"),
		LatLng(52.2393173459694, 6.85577932444805), 3
	),
	BaseStation(
		486, "UTB1_1213_256", MacAddress.fromString("fe:ac:81:68:5b:53"),
		LatLng(52.2392723324816, 6.85523435308213), 3
	),
	BaseStation(
		490, "UTB1_1213_232", MacAddress.fromString("ec:47:5e:21:ec:a0"),
		LatLng(52.23941742487, 6.85596166647069), 3
	),
	BaseStation(
		499, "UTB1_1213_75", MacAddress.fromString("fb:8a:94:14:ee:6b"),
		LatLng(52.2394340460213, 6.85591818815426), 3
	),
	BaseStation(
		500, "UTB1_1213_74", MacAddress.fromString("dc:a2:cc:4c:ae:57"),
		LatLng(52.2395164447045, 6.85608207442009), 3
	),
	BaseStation(
		501, "UTB1_1213_89", MacAddress.fromString("f3:24:4c:e1:37:f3"),
		LatLng(52.2394683689657, 6.85593242683131), 3
	),
	BaseStation(
		393, "UTB1_1213_208", MacAddress.fromString("cb:e3:e0:fa:43:c4"),
		LatLng(52.2392755602121, 6.85532252702038), 4
	),
	BaseStation(
		401, "UTB1_1213_287", MacAddress.fromString("e4:3f:42:d1:b5:bc"),
		LatLng(52.2393669658919, 6.85524309592772), 4
	),
	BaseStation(
		437, "UTB1_1213_154", MacAddress.fromString("ed:52:32:65:ba:77"),
		LatLng(52.2392218384828, 6.85567944767341), 4
	),
	BaseStation(
		508, "UTB1_1213_234", MacAddress.fromString("df:ad:ec:25:d3:df"),
		LatLng(52.2396152818639, 6.85528176194641), 3
	),
	BaseStation(
		519, "UTB1_1213_241", MacAddress.fromString("db:aa:a5:a4:27:51"),
		LatLng(52.2396009499949, 6.85544886124144), 1
	),
	BaseStation(
		524, "UTB1_1213_264", MacAddress.fromString("c6:fa:48:ea:dd:09"),
		LatLng(52.2392010559209, 6.85539387919105), 1
	),
	BaseStation(
		521, "UTB1_1213_262", MacAddress.fromString("f2:07:e2:5d:b1:4c"),
		LatLng(52.2393926911546, 6.85562577426079), 1
	),
	BaseStation(
		387, "UTB1_1213_7", MacAddress.fromString("e7:90:24:c6:38:d6"),
		LatLng(52.2395873110112, 6.8553585790772), 4
	),
	BaseStation(
		379, "UTB1_1213_126", MacAddress.fromString("ed:51:58:b5:6a:10"),
		LatLng(52.2393657407545, 6.85593082705486), 1
	),
	BaseStation(
		426, "UTB1_1213_276", MacAddress.fromString("c5:56:85:a3:5d:20"),
		LatLng(52.2393197271398, 6.85533624532721), 1
	),
	BaseStation(
		383, "UTB1_1213_11", MacAddress.fromString("f1:af:52:4f:fb:0f"),
		LatLng(52.2395050111002, 6.85536619983622), 3
	),
	BaseStation(
		386, "UTB1_1213_13", MacAddress.fromString("c9:c7:8d:08:f9:1a"),
		LatLng(52.2392041069379, 6.85557356338064), 3
	),
	BaseStation(
		390, "UTB1_1213_14", MacAddress.fromString("f3:d3:ff:6d:5f:52"),
		LatLng(52.2396161200587, 6.85528098122729), 4
	),
	BaseStation(
		389, "UTB1_1213_19", MacAddress.fromString("dd:97:50:b7:f0:f9"),
		LatLng(52.239087268294, 6.85555048689678), 3
	),
	BaseStation(
		395, "UTB1_1213_215", MacAddress.fromString("d0:9a:dc:ba:40:85"),
		LatLng(52.2392909068904, 6.85584410108884), 4
	),
	BaseStation(
		396, "UTB1_1213_203", MacAddress.fromString("fb:cc:c0:e8:47:07"),
		LatLng(52.2393728317058, 6.85583566631585), 4
	),
	BaseStation(
		377, "UTB1_1213_129", MacAddress.fromString("fd:be:64:11:a7:ab"),
		LatLng(52.2396048145971, 6.85606497666309), 2
	),
	BaseStation(
		381, "UTB1_1213_131", MacAddress.fromString("d6:31:92:f8:be:a2"),
		LatLng(52.2392215070583, 6.8557864495259), 2
	),
	BaseStation(
		384, "UTB1_1213_20", MacAddress.fromString("ef:03:ce:2e:2c:86"),
		LatLng(52.239133468363, 6.85569866183299), 2
	),
	BaseStation(
		407, "UTB1_1213_50", MacAddress.fromString("f1:db:77:f8:d2:47"),
		LatLng(52.2391891099934, 6.85523582025429), 2
	),
	BaseStation(
		410, "UTB1_1213_45", MacAddress.fromString("c3:ec:17:db:1e:a1"),
		LatLng(52.2395982920512, 6.8553780792604), 2
	),
	BaseStation(
		470, "UTB1_1213_204", MacAddress.fromString("cb:66:0b:bb:75:52"),
		LatLng(52.2396324932045, 6.85536716332689), 4
	),
	BaseStation(
		412, "UTB1_1213_40", MacAddress.fromString("e8:3b:d0:e6:d3:40"),
		LatLng(52.2394484198873, 6.85535486951482), 3
	),
	BaseStation(
		514, "UTB1_1213_285", MacAddress.fromString("fb:30:be:cd:88:4c"),
		LatLng(52.2395251866603, 6.85598824293059), 5
	),
	BaseStation(
		489, "UTB1_1213_298", MacAddress.fromString("c9:37:27:60:04:a9"),
		LatLng(52.2392883185758, 6.85585589817674), 1
	),
	BaseStation(
		378, "UTB1_1213_140", MacAddress.fromString("c8:36:86:3b:97:d9"),
		LatLng(52.2391612007674, 6.85562233449701), 2
	),
	BaseStation(
		400, "UTB1_1213_300", MacAddress.fromString("f2:e7:1b:cb:5e:17"),
		LatLng(52.2392852344806, 6.85585352849757), 2
	),
	BaseStation(
		406, "UTB1_1213_222", MacAddress.fromString("eb:7a:2f:d5:b9:16"),
		LatLng(52.2394032202287, 6.85597652537421), 2
	),
	BaseStation(
		503, "UTB1_1213_248", MacAddress.fromString("d6:4b:84:cd:bd:2e"),
		LatLng(52.2392784200491, 6.85523638661664), 4
	),
	BaseStation(
		409, "UTB1_1213_31", MacAddress.fromString("ff:34:f5:02:f7:67"),
		LatLng(52.2395465711301, 6.8560075446707), 2
	),
	BaseStation(
		466, "UTB1_1213_206", MacAddress.fromString("d9:e4:36:7c:5d:28"),
		LatLng(52.2391920178344, 6.85523063439718), 3
	),
	BaseStation(
		467, "UTB1_1213_217", MacAddress.fromString("d1:80:e2:fd:8c:d0"),
		LatLng(52.2391840035434, 6.85531343024389), 3
	),
	BaseStation(
		475, "UTB1_1213_65", MacAddress.fromString("fe:83:67:a2:69:bc"),
		LatLng(52.2394566676698, 6.85525609384124), 3
	),
	BaseStation(
		477, "UTB1_1213_68", MacAddress.fromString("ca:f2:cf:cb:4b:82"),
		LatLng(52.2392420972712, 6.85570180428365), 3
	),
	BaseStation(
		421, "UTB1_1213_270", MacAddress.fromString("e3:e1:0a:56:64:4a"),
		LatLng(52.2393635312182, 6.85533668725048), 2
	),
	BaseStation(
		451, "UTB1_1213_186", MacAddress.fromString("d8:b8:6c:20:f0:f2"),
		LatLng(52.2395171822778, 6.85557680627753), 1
	),
	BaseStation(
		413, "UTB1_1213_32", MacAddress.fromString("c6:e9:79:6f:16:c3"),
		LatLng(52.2396032563001, 6.85545097766451), 2
	),
	BaseStation(
		415, "UTB1_1213_148", MacAddress.fromString("ee:de:39:83:30:08"),
		LatLng(52.2396338862868, 6.85536525476096), 2
	),
	BaseStation(
		417, "UTB1_1213_280", MacAddress.fromString("ea:cf:8a:70:49:a5"),
		LatLng(52.2394521073798, 6.85534430413162), 2
	),
	BaseStation(
		419, "UTB1_1213_279", MacAddress.fromString("fe:90:05:c1:03:43"),
		LatLng(52.2390356154255, 6.8555900469189), 2
	),
	BaseStation(
		423, "UTB1_1213_259", MacAddress.fromString("f1:ae:d6:bb:5f:9b"),
		LatLng(52.2393929141446, 6.8558545636632), 2
	),
	BaseStation(
		424, "UTB1_1213_272", MacAddress.fromString("c9:b2:f2:97:9f:0d"),
		LatLng(52.2394286331505, 6.85588862617311), 2
	),
	BaseStation(
		482, "UTB1_1213_245", MacAddress.fromString("f5:a9:02:34:cb:74"),
		LatLng(52.2391893012463, 6.8552245408828), 4
	),
	BaseStation(
		488, "UTB1_1213_296", MacAddress.fromString("cf:58:04:2d:d1:c9"),
		LatLng(52.2391831428824, 6.85531117207326), 4
	),
	BaseStation(
		502, "UTB1_1213_92", MacAddress.fromString("d6:41:46:07:c2:b2"),
		LatLng(52.2395429373547, 6.85535864265234), 4
	),
	BaseStation(
		507, "UTB1_1213_257", MacAddress.fromString("ca:65:d0:97:14:bf"),
		LatLng(52.2394528014227, 6.85535677132581), 4
	),
	BaseStation(
		515, "UTB1_1213_291", MacAddress.fromString("ee:b7:c5:f3:13:0c"),
		LatLng(52.2394531069585, 6.85591510100569), 4
	),
	BaseStation(
		513, "UTB1_1213_284", MacAddress.fromString("db:27:6c:f9:cf:0f"),
		LatLng(52.2391634484188, 6.85562682399515), 5
	),
	BaseStation(
		394, "UTB1_1213_201", MacAddress.fromString("da:02:14:08:8a:c7"),
		LatLng(52.2394416578439, 6.85600568316401), 5
	),
	BaseStation(
		397, "UTB1_1213_216", MacAddress.fromString("df:4d:01:c0:f4:5a"),
		LatLng(52.2392914727389, 6.85584610105652), 5
	),
	BaseStation(
		391, "UTB1_1213_200", MacAddress.fromString("d5:3c:fc:e1:a7:1f"),
		LatLng(52.2393660363772, 6.85593210458457), 5
	),
	BaseStation(
		388, "UTB1_1213_10", MacAddress.fromString("f6:99:df:bf:2b:fa"),
		LatLng(52.2394440434828, 6.85600671589954), 3
	),
	BaseStation(
		398, "UTB1_1213_209", MacAddress.fromString("e4:6b:61:bf:49:e9"),
		LatLng(52.2390585700108, 6.85562414404479), 5
	),
	BaseStation(
		399, "UTB1_1213_294", MacAddress.fromString("cc:4b:b0:88:b3:5a"),
		LatLng(52.2393728128014, 6.85583422366225), 5
	),
	BaseStation(
		431, "UTB1_1213_166", MacAddress.fromString("e8:86:28:b3:db:34"),
		LatLng(52.239604576848, 6.85606722957659), 5
	),
	BaseStation(
		435, "UTB1_1213_165", MacAddress.fromString("d5:b6:ac:b5:75:32"),
		LatLng(52.2395012151388, 6.85606478411261), 4
	),
	BaseStation(
		436, "UTB1_1213_149", MacAddress.fromString("e2:f4:31:f6:c4:fd"),
		LatLng(52.239364021257, 6.85533492907875), 4
	),
	BaseStation(
		433, "UTB1_1213_160", MacAddress.fromString("c3:05:36:1c:5f:c6"),
		LatLng(52.2392905945519, 6.85575303554625), 4
	),
	BaseStation(
		434, "UTB1_1213_164", MacAddress.fromString("d3:38:8b:43:df:2d"),
		LatLng(52.2391458105419, 6.85560780568487), 4
	),
	BaseStation(
		494, "UTB1_1213_1", MacAddress.fromString("de:fe:65:0c:ae:c4"),
		LatLng(52.239634894467, 6.85536955810451), 5
	),
	BaseStation(
		495, "UTB1_1213_88", MacAddress.fromString("ca:e4:01:d7:dd:9a"),
		LatLng(52.2394030350542, 6.85525126309685), 5
	),
	BaseStation(
		496, "UTB1_1213_84", MacAddress.fromString("ce:a5:5f:fa:7a:ca"),
		LatLng(52.2395525595101, 6.8552701443638), 5
	),
	BaseStation(
		498, "UTB1_1213_80", MacAddress.fromString("c7:2c:9b:8c:24:0b"),
		LatLng(52.2396371911248, 6.85528061746972), 5
	),
	BaseStation(
		511, "UTB1_1213_286", MacAddress.fromString("fe:1b:1a:42:1c:49"),
		LatLng(52.239295595047, 6.85575767180393), 5
	),
	BaseStation(
		516, "UTB1_1213_289", MacAddress.fromString("d3:85:d9:c0:82:31"),
		LatLng(52.2391362296645, 6.8556988450101), 5
	),
	BaseStation(
		469, "UTB1_1213_205", MacAddress.fromString("d3:b4:6d:08:db:64"),
		LatLng(52.2395868478334, 6.85535805409858), 3
	),
	BaseStation(
		471, "UTB1_1213_64", MacAddress.fromString("fb:f1:58:bc:c7:af"),
		LatLng(52.2391366460728, 6.8556991472614), 3
	),
	BaseStation(
		473, "UTB1_1213_56", MacAddress.fromString("de:eb:c8:69:b6:48"),
		LatLng(52.2391536699344, 6.85569863623045), 3
	),
	BaseStation(
		472, "UTB1_1213_63", MacAddress.fromString("d5:90:35:d1:b3:19"),
		LatLng(52.2396132175131, 6.85527748784979), 2
	),
	BaseStation(
		454, "UTB1_1213_187", MacAddress.fromString("d8:69:23:a7:13:db"),
		LatLng(52.2394622718903, 6.85581695808128), 1
	),
	BaseStation(
		518, "UTB1_1213_290", MacAddress.fromString("c6:e0:31:d2:6a:6f"),
		LatLng(52.2394553288736, 6.85526780480154), 5
	),
	BaseStation(
		523, "UTB1_1213_239", MacAddress.fromString("db:b6:5c:8f:06:7a"),
		LatLng(52.2395497245326, 6.85534834728952), 5
	),
	BaseStation(
		530, "UTB1_1213_44", MacAddress.fromString("e5:f8:b9:10:26:a8"),
		LatLng(52.2392171614239, 6.85567683512634), 5
	),
	BaseStation(
		528, "UTB1_1213_34", MacAddress.fromString("ee:77:2f:7b:81:00"),
		LatLng(52.2395286761618, 6.85598770813876), 4
	),
	BaseStation(
		533, "UTB1_1213_98", MacAddress.fromString("de:cf:fc:9a:a0:3a"),
		LatLng(52.2395181227673, 6.85608236323184), 5
	),
	BaseStation(
		512, "UTB1_1213_2", MacAddress.fromString("f1:f3:03:11:5a:70"),
		LatLng(52.239213482193, 6.85577989254672), 4
	),
	BaseStation(
		517, "UTB1_1213_299", MacAddress.fromString("f8:62:6e:0f:54:80"),
		LatLng(52.2394228986172, 6.85598539860147), 4
	),
	BaseStation(
		485, "UTB1_1213_242", MacAddress.fromString("f8:33:56:ec:2c:5b"),
		LatLng(52.2390816311267, 6.85553999142903), 1
	),
	BaseStation(
		522, "UTB1_1213_250", MacAddress.fromString("d0:0b:55:15:84:ba"),
		LatLng(52.2394689441382, 6.85577442765355), 2
	),
	BaseStation(
		462, "UTB1_1213_58", MacAddress.fromString("f5:45:99:07:14:50"),
		LatLng(52.2396322346715, 6.85536758986991), 3
	),
	BaseStation(
		549, "UTB1_1213_95", MacAddress.fromString("cc:a0:f2:a3:a0:96"),
		LatLng(52.2394388029757, 6.85561200657433), 3
	),
	BaseStation(
		556, "UTB1_1213_27", MacAddress.fromString("f4:4e:3b:cb:f7:d3"),
		LatLng(52.2395411203932, 6.85535742873105), 3
	),
	BaseStation(
		382, "UTB1_1213_138", MacAddress.fromString("d7:3a:c4:28:15:65"),
		LatLng(52.2394346804672, 6.85525207359252), 1
	),
	BaseStation(
		542, "UTB1_1213_156", MacAddress.fromString("e5:02:1e:97:b5:a5"),
		LatLng(52.2392726553171, 6.85523165534047), 1
	),
	BaseStation(
		468, "UTB1_1213_196", MacAddress.fromString("c2:bb:d0:7b:8a:c0"),
		LatLng(52.2396185033573, 6.85527789771921), 1
	),
	BaseStation(
		464, "UTB1_1213_199", MacAddress.fromString("df:8a:0a:da:ed:cd"),
		LatLng(52.2395253924283, 6.85526654141779), 1
	),
	BaseStation(
		460, "UTB1_1213_212", MacAddress.fromString("f7:9a:0a:c7:81:f3"),
		LatLng(52.2393720786345, 6.85524802520061), 1
	),
	BaseStation(
		461, "UTB1_1213_214", MacAddress.fromString("fc:87:f9:5c:a6:7a"),
		LatLng(52.2391874468943, 6.85523348839622), 1
	),
	BaseStation(
		418, "UTB1_1213_278", MacAddress.fromString("cb:83:0a:52:58:ea"),
		LatLng(52.2395771246495, 6.85536182409014), 1
	),
	BaseStation(
		385, "UTB1_1213_12", MacAddress.fromString("c1:97:69:5a:79:00"),
		LatLng(52.2391835995874, 6.85531036977894), 1
	),
	BaseStation(
		526, "UTB1_1213_30", MacAddress.fromString("db:17:c4:c3:44:25"),
		LatLng(52.2391370161336, 6.85570508385922), 1
	),
	BaseStation(
		553, "UTB1_1213_33", MacAddress.fromString("e6:a6:c7:ba:20:fa"),
		LatLng(52.2394786971859, 6.8560401205866), 1
	),
	BaseStation(
		531, "UTB1_1213_38", MacAddress.fromString("ff:cb:c7:39:2c:a9"),
		LatLng(52.2390513866869, 6.85561586500163), 1
	),
	BaseStation(
		487, "UTB1_1213_85", MacAddress.fromString("f6:7d:4d:f1:50:65"),
		LatLng(52.2396256227888, 6.85536763281721), 1
	),
	BaseStation(
		422, "UTB1_1213_152", MacAddress.fromString("e0:3e:6a:22:5e:83"),
		LatLng(52.2393188601276, 6.85577487447769), 1
	),
	BaseStation(
		541, "UTB1_1213_157", MacAddress.fromString("d7:2d:a5:d6:e8:ab"),
		LatLng(52.2391664166529, 6.85562162991615), 1
	),
	BaseStation(
		510, "UTB1_1213_233", MacAddress.fromString("dd:dd:20:4b:08:1d"),
		LatLng(52.2395843917105, 6.85604513160699), 1
	),
	BaseStation(
		504, "UTB1_1213_243", MacAddress.fromString("fe:14:99:52:ba:e8"),
		LatLng(52.2393947123524, 6.85585307919091), 1
	),
	BaseStation(
		506, "UTB1_1213_246", MacAddress.fromString("d0:80:83:44:ff:ee"),
		LatLng(52.2395582369601, 6.85611947834663), 1
	),
	BaseStation(
		402, "UTB1_1213_263", MacAddress.fromString("c6:8f:60:6c:a6:a6"),
		LatLng(52.2392452228211, 6.85570318904373), 1
	),
	BaseStation(
		428, "UTB1_1213_273", MacAddress.fromString("f9:dc:89:d4:7a:11"),
		LatLng(52.2392180746344, 6.85578043157727), 1
	),
	BaseStation(
		555, "UTB1_1213_35", MacAddress.fromString("ed:d9:6c:c6:38:f1"),
		LatLng(52.23921293355, 6.85577623143281), 3
	),
	BaseStation(
		432, "UTB1_1213_158", MacAddress.fromString("d1:d3:ab:f3:8e:63"),
		LatLng(52.2394897811625, 6.85594964262918), 1
	)
)
