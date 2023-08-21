package com.androidbattalion.cinemates.data

import com.androidbattalion.cinemates.R


//This data class serves as a placeholder for testing the UI and contains dummy data.

data class Media(
    val title: String,
    val description:String,
    val coverArtPortraitUri: Int
)
const val dummyCoverArt = R.drawable.dummyposter
val mediaList = listOf(
    Media("Inception", "A mind-bending action thriller about entering dreams.", dummyCoverArt),
    Media("The Matrix", "A science fiction classic exploring the concept of reality.", dummyCoverArt),
    Media("Avengers: Endgame", "Superheroes unite to save the universe from a powerful threat.", dummyCoverArt),
    Media("Pulp Fiction", "Quirky characters' stories intertwine in this crime film.", dummyCoverArt),
    Media("Stranger Things", "A group of friends encounters supernatural mysteries.", dummyCoverArt),
    Media("The Shawshank Redemption", "A tale of friendship and hope in the midst of adversity.", dummyCoverArt),
    Media("Game of Thrones", "Noble families vie for power in a fantasy realm.", dummyCoverArt),
    Media("Jurassic Park", "Dinosaurs come back to life in this adventure park gone awry.", dummyCoverArt)
)
