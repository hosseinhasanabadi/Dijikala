package com.example.dijikala.navigation

sealed class Screen ( val route :String){
    object Splash : Screen( "Splash screen")
    object Home : Screen( "Home screen")
    object Profile : Screen( "Profile screen")
    object Category : Screen( "Category screen")
    object Basket : Screen( "Basket screen")


    fun withArgs (vararg args :Any):String{
        return  buildString {
            append(route)
            args.forEach {
                append("/$it")

            }
        }
    }
}