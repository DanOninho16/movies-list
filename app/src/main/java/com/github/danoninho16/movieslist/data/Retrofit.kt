package com.github.danoninho16.movieslist.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofit = Retrofit.Builder()
    .baseUrl("http://www.omdbapi.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()