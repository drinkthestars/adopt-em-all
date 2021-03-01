package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.androiddevchallenge.data.Repository
import com.example.androiddevchallenge.ui.PokeList

@Composable
fun PokeApp() {

    val repo = remember { Repository() }
    PokeList(pokeItems = repo.pokeItems)

}
