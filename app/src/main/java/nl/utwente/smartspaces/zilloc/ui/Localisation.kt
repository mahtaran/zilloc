package nl.utwente.smartspaces.zilloc.ui

import android.Manifest
import android.content.Context
import android.content.res.Configuration
import android.hardware.SensorManager
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.google.android.gms.location.LocationServices

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun Anomalies(
	padding: PaddingValues,
	localisationViewModel: LocalisationViewModel = viewModel()
) {
	val context = LocalContext.current
	val configuration = LocalConfiguration.current

	val locationPermissionState = rememberMultiplePermissionsState(
		listOf(
			Manifest.permission.ACCESS_COARSE_LOCATION,
			Manifest.permission.ACCESS_FINE_LOCATION
		)
	)
	val locationClient = LocationServices.getFusedLocationProviderClient(context)

	val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as SensorManager

	if (locationPermissionState.allPermissionsGranted) {
		when (configuration.orientation) {
			Configuration.ORIENTATION_PORTRAIT -> {
				Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
					Map(
						padding = padding,
						modifier = Modifier.fillMaxSize()
					)
				}
			}

			Configuration.ORIENTATION_LANDSCAPE -> {
				Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
					Map(
						padding = padding,
						modifier = Modifier.weight(2f)
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
				text = "Location permission is needed to localise your device",
				textAlign = TextAlign.Center
			)
			Button(
				onClick = { locationPermissionState.launchMultiplePermissionRequest() }
			) {
				Text("Request permission")
			}
		}
	}
}

@Composable
fun Map(
	padding: PaddingValues,
	modifier: Modifier = Modifier.fillMaxSize(),
	localisationViewModel: LocalisationViewModel = viewModel()
) {
	val uiState by localisationViewModel.uiState.collectAsState()

	Column {
		Text(text = "Localisation")
	}
}
