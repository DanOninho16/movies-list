package com.github.danoninho16.movieslist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.danoninho16.movieslist.data.moviesService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {
    private val _moviesState = MutableStateFlow(MoviesUiState())
    val moviesUiState: StateFlow<MoviesUiState>
        get() = _moviesState

    fun searchMovies() {
        viewModelScope.launch {
            _moviesState.update { currentState ->
                currentState.copy(
                    movies = moviesService.searchMovies("transformers").movies
                )
            }
        }
    }
}