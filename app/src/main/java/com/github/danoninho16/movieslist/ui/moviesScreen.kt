package com.github.danoninho16.movieslist.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Movie(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun moviesList(list: List<String>){
    Column(){
        list.forEach {movie ->
            Movie(name = movie)
        }
    }
}