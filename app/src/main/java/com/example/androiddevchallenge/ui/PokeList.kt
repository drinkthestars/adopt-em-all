/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.entity.PokeItem
import dev.chrisbanes.accompanist.insets.LocalWindowInsets
import dev.chrisbanes.accompanist.insets.toPaddingValues

@Composable
fun PokeList(
    pokeItems: List<PokeItem>,
    topAppBarSize: Int,
    onItemClick: (PokeItem) -> Unit
) {
    Box(Modifier.fillMaxSize()) {
        LazyColumn(
            contentPadding = LocalWindowInsets.current.systemBars.toPaddingValues(
                top = false,
                additionalTop = with(LocalDensity.current) { topAppBarSize.toDp() }
            ),
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Spacer(modifier = Modifier.height(48.dp))
            }
            items(pokeItems, key = { it.id }) { pokeItem ->
                PokeListItem(pokeItem, onItemClick)
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}
