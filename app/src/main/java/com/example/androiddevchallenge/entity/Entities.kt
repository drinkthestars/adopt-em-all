package com.example.androiddevchallenge.entity

import com.example.androiddevchallenge.data.Type

data class PokeItemDetail(
    val pokeItem: PokeItem,
    val bio: String,
    val shareUrl: String
)

data class PokeItem(
    val id: Int,
    val name: String,
    val pokedexColor: Long,
    val types: List<Type>,
    val imageUrl: String,
    val height: String,
    val weight: String
)
