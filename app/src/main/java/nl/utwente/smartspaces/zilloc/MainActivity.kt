package nl.utwente.smartspaces.zilloc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import nl.utwente.smartspaces.zilloc.ui.Localisation
import nl.utwente.smartspaces.zilloc.ui.theme.ZillocTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()

		setContent {
			ZillocTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
					Localisation(padding)
				}
			}
		}
	}
}
