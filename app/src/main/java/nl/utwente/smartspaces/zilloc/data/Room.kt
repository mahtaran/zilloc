package nl.utwente.smartspaces.zilloc.data

import com.google.android.gms.maps.model.LatLng
import kotlin.math.hypot
import kotlin.math.pow

enum class Room(
	val building: Building,
	val floor: Int,
	val room: String,
	val points: List<LatLng> = emptyList()
) {
	Zilverling_5000VA(
		Building.Zilverling, 5, "5000VA", listOf(
			LatLng(52.23934799784378, 6.856245783326999),
			LatLng(52.23920868819664, 6.85661689547853),
			LatLng(52.239174195949815, 6.856585379453887),
			LatLng(52.239145863069304, 6.856661154263049),
			LatLng(52.23916269856591, 6.856675906460233),
			LatLng(52.23918076606858, 6.856628297484067),
			LatLng(52.23919742595003, 6.85664439147139),
			LatLng(52.23916516192098, 6.856730888823601),
			LatLng(52.239183053888915, 6.856748997276401),
			LatLng(52.239269, 6.856518),
			LatLng(52.239287, 6.856535),
			LatLng(52.239302, 6.856497),
			LatLng(52.239285, 6.856481),
			LatLng(52.239307, 6.856423),
			LatLng(52.239322, 6.856441),
			LatLng(52.239384, 6.856283),
			LatLng(52.23936565467609, 6.856294063169111),
			LatLng(52.2393500510418, 6.856334296367986),
			LatLng(52.239342659818924, 6.856327590774091),
			LatLng(52.23935867407315, 6.856288028129447),
			LatLng(52.23936565467609, 6.856294063169111),
			LatLng(52.239384, 6.856283)
		)
	),
	Zilverling_5002(
		Building.Zilverling, 5, "5002", listOf(
			LatLng(52.23936565467609, 6.856294063169111),
			LatLng(52.2393500510418, 6.856334296367986),
			LatLng(52.239342659818924, 6.856327590774091),
			LatLng(52.23935867407315, 6.856288028129447)
		)
	),
	Zilverling_5001(
		Building.Zilverling, 5, "5001", listOf(
			LatLng(52.23934799784378, 6.856245783326999),
			LatLng(52.239316790486825, 6.85621426746629),
			LatLng(52.23929235004644, 6.856273576646802),
			LatLng(52.23932478925276, 6.8563097863939735)
		)
	),
	Zilverling_5003(
		Building.Zilverling, 5, "5003", listOf(
			LatLng(52.23929235004644, 6.856273576646802),
			LatLng(52.23932478925276, 6.8563097863939735),
			LatLng(52.23930959623714, 6.856345996232536),
			LatLng(52.239277157043105, 6.856311798183247)
		)
	),
	Zilverling_5005(
		Building.Zilverling, 5, "5005", listOf(
			LatLng(52.23930959623714, 6.856345996232536),
			LatLng(52.239277157043105, 6.856311798183247),
			LatLng(52.239263125723134, 6.856351360807183),
			LatLng(52.23929515428439, 6.856385558929992)
		)
	),
	Zilverling_5007(
		Building.Zilverling, 5, "5007", listOf(
			LatLng(52.239263125723134, 6.856351360807183),
			LatLng(52.23929515428439, 6.856385558929992),
			LatLng(52.23928078249008, 6.8564231098233535),
			LatLng(52.23924875402926, 6.856389582221283)
		)
	),
	Zilverling_5009(
		Building.Zilverling, 5, "5009", listOf(
			LatLng(52.23928078249008, 6.8564231098233535),
			LatLng(52.23924875402926, 6.856389582221283),
			LatLng(52.23923397161026, 6.856427803624147),
			LatLng(52.23926641077176, 6.856462001779758)
		)
	),
	Zilverling_5011(
		Building.Zilverling, 5, "5011", listOf(
			LatLng(52.23923397161026, 6.856427803624147),
			LatLng(52.23926641077176, 6.856462001779758),
			LatLng(52.23925203895073, 6.8565008937274),
			LatLng(52.239219599801125, 6.856465354452741)
		)
	),
	Zilverling_5013(
		Building.Zilverling, 5, "5013", listOf(
			LatLng(52.23925203895073, 6.8565008937274),
			LatLng(52.239219599801125, 6.856465354452741),
			LatLng(52.2392052279772, 6.856504916910775),
			LatLng(52.23923766711705, 6.856539115100983)
		)
	),
	Zilverling_5015(
		Building.Zilverling, 5, "5015", listOf(
			LatLng(52.2392052279772, 6.856504916910775),
			LatLng(52.23923766711705, 6.856539115100983),
			LatLng(52.23922329526809, 6.856578677554776),
			LatLng(52.239190445517536, 6.856543138243844)
		)
	),
	Zilverling_5_Stairs(
		Building.Zilverling, 5, "Stairs", listOf(
			LatLng(52.23922329526809, 6.856578677554776),
			LatLng(52.239190445517536, 6.856543138243844),
			LatLng(52.239174195949815, 6.856585379453887),
			LatLng(52.23920868819664, 6.85661689547853)
		)
	),
	Zilverling_5019(
		Building.Zilverling, 5, "5019", listOf(
			LatLng(52.23919742595003, 6.85664439147139),
			LatLng(52.23918076606858, 6.856628297484067),
			LatLng(52.239174606687186, 6.8566484139645905),
			LatLng(52.23919021031327, 6.856663836710568)
		)
	),
	Zilverling_5_Elevator(
		Building.Zilverling, 5, "Elevator", listOf(
			LatLng(52.23919021031327, 6.856663836710568),
			LatLng(52.239174606687186, 6.8566484139645905),
			LatLng(52.23916269856591, 6.856675906460233),
			LatLng(52.23917830218422, 6.856693340863458)
		)
	),
	Zilverling_5023(
		Building.Zilverling, 5, "5023", listOf(
			LatLng(52.23917830218422, 6.856693340863458),
			LatLng(52.239145863069304, 6.856661154263049),
			LatLng(52.23913272300906, 6.856696020855232),
			LatLng(52.23916516192098, 6.856730888823601)
		)
	),
	Zilverling_5006(
		Building.Zilverling, 5, "5006", listOf(
			LatLng(52.239384, 6.856283),
			LatLng(52.239416, 6.856315),
			LatLng(52.239379, 6.856414),
			LatLng(52.239345, 6.856382)
		)
	),
	Zilverling_5010(
		Building.Zilverling, 5, "5010", listOf(
			LatLng(52.239379, 6.856414),
			LatLng(52.239345, 6.856382),
			LatLng(52.239331, 6.856418),
			LatLng(52.239364, 6.856454)
		)
	),
	Zilverling_5014(
		Building.Zilverling, 5, "5014", listOf(
			LatLng(52.239317, 6.856459),
			LatLng(52.239302, 6.856441),
			LatLng(52.239307, 6.856423),
			LatLng(52.239322, 6.856441)
		)
	),
	Zilverling_5016(
		Building.Zilverling, 5, "5016", listOf(
			LatLng(52.239331, 6.856418),
			LatLng(52.239364, 6.856454),
			LatLng(52.239349, 6.856492),
			LatLng(52.239317, 6.856459)
		)
	),
	Zilverling_5022(
		Building.Zilverling, 5, "5022", listOf(
			LatLng(52.239349, 6.856492),
			LatLng(52.239317, 6.856459),
			LatLng(52.239272, 6.856574),
			LatLng(52.239305, 6.856609)
		)
	),
	Zilverling_5_ToiletMen(
		Building.Zilverling, 5, "Toilet (men)", listOf(
			LatLng(52.239317, 6.856459),
			LatLng(52.239302, 6.856441),
			LatLng(52.239285, 6.856481),
			LatLng(52.239302, 6.856497)
		)
	),
	Zilverling_5_ToiletWomen(
		Building.Zilverling, 5, "Toilet (women)", listOf(
			LatLng(52.239272, 6.856574),
			LatLng(52.239287, 6.856535),
			LatLng(52.239269, 6.856518),
			LatLng(52.239256, 6.856558)
		)
	),
	Zilverling_5030(
		Building.Zilverling, 5, "5030", listOf(
			LatLng(52.239265, 6.856591),
			LatLng(52.239272, 6.856574),
			LatLng(52.239256, 6.856558),
			LatLng(52.239249, 6.856577)
		)
	),
	Zilverling_5032(
		Building.Zilverling, 5, "5032", listOf(
			LatLng(52.239305, 6.856609),
			LatLng(52.239272, 6.856574),
			LatLng(52.239256, 6.856558),
			LatLng(52.239249, 6.856577),
			LatLng(52.239242, 6.856595),
			LatLng(52.239291, 6.856648)
		)
	),
	Zilverling_5034(
		Building.Zilverling, 5, "5034", listOf(
			LatLng(52.239242, 6.856595),
			LatLng(52.239291, 6.856648),
			LatLng(52.239276, 6.856686),
			LatLng(52.239226, 6.856634)
		)
	),
	Zilverling_5038(
		Building.Zilverling, 5, "5038", listOf(
			LatLng(52.239276, 6.856686),
			LatLng(52.239226, 6.856634),
			LatLng(52.239212, 6.856673),
			LatLng(52.239262, 6.856724)
		)
	),
	Zilverling_5042(
		Building.Zilverling, 5, "5042", listOf(
			LatLng(52.239212, 6.856673),
			LatLng(52.239262, 6.856724),
			LatLng(52.2392471109818, 6.856761738236748),
			LatLng(52.2391974257927, 6.856710105438533)
		)
	),
	Zilverling_5046(
		Building.Zilverling, 5, "5046", listOf(
			LatLng(52.2391974257927, 6.856710105438533),
			LatLng(52.2392471109818, 6.856761738236748),
			LatLng(52.23923314968317, 6.856801300659377),
			LatLng(52.23920029998755, 6.856766431727404),
			LatLng(52.23920769124708, 6.856749668011244),
			LatLng(52.23919044514863, 6.856731563013528)
		)
	),
	Zilverling_5048(
		Building.Zilverling, 5, "5048", listOf(
			LatLng(52.23920029998755, 6.856766431727404),
			LatLng(52.23920769124708, 6.856749668011244),
			LatLng(52.23919044514863, 6.856731563013528),
			LatLng(52.239183053888915, 6.856748997276401)
		)
	);

	fun shade(location: LatLng): Double {
		val centre = LatLng(
			points.sumOf { it.latitude } / points.size,
			points.sumOf { it.longitude } / points.size
		)


		val distance = hypot(
			location.latitude - centre.latitude,
			location.longitude - centre.longitude
		)

		return (1 - (distance / SHADING_DISTANCE_NORMALISATION))
			.pow(SHADING_FALLOFF) * SHADING_INTENSITY
	}
}
