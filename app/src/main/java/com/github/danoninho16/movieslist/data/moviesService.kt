package com.github.danoninho16.movieslist.data

import retrofit2.http.GET
import retrofit2.http.Path

interface MoviesService {
    @GET("?apikey=fc3d805ds&={searchQuery}")
    fun searchMovies(@Path("searchQuery")searchQuery: String): SearchResponse
}

val moviesService = retrofit.create(MoviesService::class.java)

val movies = listOf(
    "Transformers 1",
    "Transformers 2",
    "Titanic",
    "Transformers 3",
)