package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.entity.PokeItem

@Composable
fun PokeList(pokeItems: List<PokeItem>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Spacer(modifier = Modifier.height(48.dp))
        }

        items(pokeItems, key = { it.id }) { pokeItem ->
            PokeListItem(pokeItem)
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}
