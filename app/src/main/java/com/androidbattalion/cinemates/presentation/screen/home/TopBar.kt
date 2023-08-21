package com.androidbattalion.cinemates.presentation.screen.home

import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.androidbattalion.cinemates.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    actionIconID: Int,
){
    TopAppBar(
        title = {
            Text(title)
        },
        actions = {
            IconButton(
                onClick = {},
                modifier = Modifier.size(24.dp)
                ) {
                Icon(painter = painterResource(id = actionIconID),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                    )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
    )
}


@Preview
@Composable
fun AppTopBarPreview(){
    TopBar(title = "CineMates", actionIconID = R.drawable.person)
}
