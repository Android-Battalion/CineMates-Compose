package com.androidbattalion.cinemates.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.androidbattalion.cinemates.data.mediaList
import com.androidbattalion.cinemates.presentation.screen.home.HomeScreen

@Composable
fun CineMatesApp(){

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route)
    {
        composable(Screen.HomeScreen.route){
            HomeScreen(dummyData = mediaList)
        }
    }
}
