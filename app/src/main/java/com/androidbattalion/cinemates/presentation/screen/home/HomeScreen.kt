package com.androidbattalion.cinemates.presentation.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.androidbattalion.cinemates.R
import com.androidbattalion.cinemates.data.Media

@Composable
fun HomeScreen(
    dummyData: List<Media>
){
    Scaffold(containerColor = MaterialTheme.colorScheme.tertiary) {
        Column {
            TopBar(
                title = "CineMates",
                actionIconID = R.drawable.person)

            Spacer(modifier = Modifier.height(16.dp))

            CategoryRow(category = Category("Upcoming",dummyData))
        }
    }
}
