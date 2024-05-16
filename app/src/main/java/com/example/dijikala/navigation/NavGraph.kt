package com.example.dijikala.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dijikala.ui.screen.SplashScreen

@Composable

fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.rout
    )

    {
        composable(route = Screen.Splash.rout) {
            SplashScreen(navController = navController)

        }

    }

}