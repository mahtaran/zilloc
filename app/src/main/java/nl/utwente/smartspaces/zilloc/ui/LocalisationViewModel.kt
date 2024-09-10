package nl.utwente.smartspaces.zilloc.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.time.TimeSource

class LocalisationViewModel : ViewModel() {
	private val _uiState = MutableStateFlow(LocalisationUiState())
	val uiState = _uiState.asStateFlow()

	private val timeSource = TimeSource.Monotonic

	fun updateLocation(x: Double, y: Double) {
		_uiState.update { currentState ->
			currentState.copy(
				lastUpdate = timeSource.markNow()
			)
		}
	}
}
