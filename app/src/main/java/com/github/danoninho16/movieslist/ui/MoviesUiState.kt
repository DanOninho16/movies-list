package com.github.danoninho16.movieslist.ui

import com.github.danoninho16.movieslist.data.Movie

data class MoviesUiState (
    val movies: List<Movie> = listOf()
)