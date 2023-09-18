package com.github.danoninho16.movieslist.data

import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("Search") val movies: List<Movie>
)
