package com.androidbattalion.cinemates.presentation.navigation

sealed class Screen (val route:String){
    object HomeScreen: Screen("home")
    object SearchScreen: Screen("search")
    object SavedScreen: Screen("saved")
    object ProfileScreen: Screen("profile")
}
