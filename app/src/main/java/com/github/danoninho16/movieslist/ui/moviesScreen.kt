package com.github.danoninho16.movieslist.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.danoninho16.movieslist.data.Movie

@Composable
fun Movie(movie: Movie, modifier: Modifier = Modifier) {
    Text(
        text = movie.name,
        modifier = modifier
    )
}
@Composable
fun moviesList(
    moviesViewModel: MoviesViewModel = viewModel(),
    modifier: Modifier = Modifier) {
    val moviesState by moviesViewModel.moviesUiState.collectAsState()
    Column(){
        moviesState.movies.forEach { movie ->
            Movie(movie = movie)
        }
    }
}