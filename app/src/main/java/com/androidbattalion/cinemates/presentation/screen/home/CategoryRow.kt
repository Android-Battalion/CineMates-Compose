package com.androidbattalion.cinemates.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.androidbattalion.cinemates.data.Media
import com.androidbattalion.cinemates.presentation.theme.Spacing


data class Category(
    val title: String,
    val items: List<Media>
)
@Composable
fun CategoryRow(category: Category){
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Text(
            text = category.title,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(horizontal = Spacing.ContainerSpacing.value)
            )
        Spacer(modifier = Modifier
            .height(5.dp)
            .fillMaxWidth())

        LazyRow(
            contentPadding = PaddingValues(start = Spacing.ContainerSpacing.value),
            horizontalArrangement = Arrangement.spacedBy(Spacing.RegularSpacing.value)
        ){
            this.items(items = category.items){
                MovieCard(imageModel = it.coverArtPortraitUri, title = it.title)
            }
        }

    }
}
