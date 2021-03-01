package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.entity.PokeItem

class Repository {
    val pokeItems = listOf(
        PokeItem(
            id = 0,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 1,
            name = "Charmander",
            pokedexColor = 0xBBf05868,
            types = listOf(Type.Fire),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/7/73/004Charmander.png/250px-004Charmander.png",
            height = "2'00\"",
            weight = "18.7 lbs"
        ),
        PokeItem(
            id = 2,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 3,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 4,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 5,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 6,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 7,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 8,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 9,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        ),
        PokeItem(
            id = 10,
            name = "Bulbasaur",
            pokedexColor = 0xBB40b868,
            types = listOf(Type.Grass, Type.Poison),
            imageUrl = "https://cdn.bulbagarden.net/upload/thumb/2/21/001Bulbasaur.png/250px-001Bulbasaur.png",
            height = "2'04\"",
            weight = "15.2 lbs"
        )
    )
}


enum class Type(
    val nameColor: Long,
    val bgColor: Long,
) {
    Grass(nameColor = 0xFF69c23d, bgColor = 0xFFA7DB8D),
    Poison(nameColor = 0xFFA040A0, bgColor = 0xFFC183C1),
    Fire(nameColor = 0xFFA040A0, bgColor = 0xFFC183C1),
    Electric(nameColor = 0xFFA040A0, bgColor = 0xFFC183C1),
    Water(nameColor = 0xFFA040A0, bgColor = 0xFFC183C1),
    Psychic(nameColor = 0xFFF85888, bgColor = 0xFFFA92B2)
}
