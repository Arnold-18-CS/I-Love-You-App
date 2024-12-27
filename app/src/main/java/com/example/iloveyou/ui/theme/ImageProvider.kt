package com.example.iloveyou.ui.theme

object ImageProvider {
    private val loveImages = listOf(
        "R.drawable.love",
        "R.drawable.love1",
        "R.drawable.love2",
        "R.drawable.love3"
    )

    fun getRandomImages(): String{
        return loveImages.random()
    }

}