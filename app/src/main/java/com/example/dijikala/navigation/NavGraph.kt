package com.example.dijikala.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dijikala.ui.screen.BasketScreen
import com.example.dijikala.ui.screen.CategoryScreen
import com.example.dijikala.ui.screen.HomeScreen
import com.example.dijikala.ui.screen.ProfileScreen
import com.example.dijikala.ui.screen.SplashScreen

@Composable

fun SetupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    )

    {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)

        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)

        }
        composable(route = Screen.Basket.route) {
            BasketScreen(navController = navController)

        }

        composable(route = Screen.Category.route) {
            CategoryScreen(navController = navController)

        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(navController = navController)

        }


    }

}