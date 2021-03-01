package com.example.androiddevchallenge.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.Type
import com.example.androiddevchallenge.entity.PokeItem
import com.example.androiddevchallenge.ui.theme.canary
import com.example.androiddevchallenge.ui.theme.navyLight
import dev.chrisbanes.accompanist.coil.CoilImage

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun PokeListItem(pokeItem: PokeItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth(0.9f).wrapContentHeight()
    ) {
        PokemonInfoCard(pokeItem)
        PokemonImageOverlay(pokeItem)
    }
}

@OptIn(ExperimentalStdlibApi::class)
@Composable
private fun BoxScope.PokemonInfoCard(pokeItem: PokeItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.83f)
            .wrapContentHeight()
            .padding(vertical = 16.dp, horizontal = 12.dp)
            .align(Alignment.BottomCenter),
        shape = RoundedCornerShape(42.dp),
        elevation = 6.dp
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(32.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                text = pokeItem.name.uppercase(),
                style = MaterialTheme.typography.h5,
                letterSpacing = 4.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row { pokeItem.types.forEach { TypeBubble(it) } }
            Spacer(modifier = Modifier.height(40.dp))
            Row {
                PropertiesColumn("Height", pokeItem.height)
                Spacer(modifier = Modifier.fillMaxWidth(0.34f))
                PropertiesColumn("Weight", pokeItem.weight)
            }
        }
    }
}

@Composable
private fun PokemonImageOverlay(pokeItem: PokeItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth().wrapContentHeight()
    ) {
        Column(modifier = Modifier.wrapContentSize()) {
            CoilImage(
                modifier = Modifier.height(170.dp),
                data = pokeItem.imageUrl,
                contentDescription = pokeItem.name,
                fadeIn = true
            )
            Spacer(modifier = Modifier.height(230.dp))
        }
    }
}

@Composable
private fun PropertiesColumn(propertyName: String, propertyValue: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            propertyName,
            style = MaterialTheme.typography.subtitle2,
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            propertyValue,
            style = MaterialTheme.typography.subtitle2,
            color = canary,
            letterSpacing = 2.sp
        )
    }
}

@Composable
private fun TypeBubble(type: Type) {
    Spacer(modifier = Modifier.width(12.dp))
    Text(
        modifier = Modifier
            .wrapContentSize()
            .border(1.2.dp, color = Color(type.bgColor), shape = CircleShape)
            .background(
                color = Color.Transparent,
                shape = CircleShape
            )
            .padding(horizontal = 12.dp, vertical = 8.dp),
        textAlign = TextAlign.Center,
        text = type.name.toLowerCase(),
        style = MaterialTheme.typography.caption,
        letterSpacing = 2.sp,
        color = Color(type.bgColor)
    )
}
