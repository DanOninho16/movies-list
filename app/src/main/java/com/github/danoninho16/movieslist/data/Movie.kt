package com.github.danoninho16.movieslist.data

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("Title") val name: String
)
