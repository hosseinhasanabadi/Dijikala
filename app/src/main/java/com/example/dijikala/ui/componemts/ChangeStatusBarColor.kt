package com.example.dijikala.ui.componemts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.dijikala.navigation.Screen
import com.example.dijikala.ui.theme.Purple80
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ChangeStatusBarColor(navController: NavHostController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val systemUiController = rememberSystemUiController()

    when(navBackStackEntry?.destination?.route){
        Screen.Splash.route ->{
            SideEffect {
                systemUiController.setSystemBarsColor(
                    color =Purple80
                )
            }
        }
        else ->{
            systemUiController.setSystemBarsColor(
                color = Color.White
            )
        }
    }

}