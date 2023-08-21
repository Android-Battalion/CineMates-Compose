package com.androidbattalion.cinemates.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.androidbattalion.cinemates.R

@Composable
fun MovieCard(
    imageModel: Any,
    title: String,
    imageQuality: FilterQuality = FilterQuality.Medium
){
    Column(
        modifier =
            Modifier
    ) {
        AsyncImage(
            model = imageModel,
            contentDescription = "poster of $title",
            contentScale = ContentScale.Fit,
            filterQuality = imageQuality,
            modifier = Modifier
                .width(110.dp)
                .height(171.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = title,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleSmall,
            softWrap = true,
            overflow = TextOverflow.Ellipsis,
            maxLines = 2,
            modifier = Modifier.width(110.dp)

            )
    }
}

@Preview
@Composable
fun MovieCardPreview(){
    MovieCard(imageModel = painterResource(id = R.drawable.dummyposter), title = "Freedom")
}
