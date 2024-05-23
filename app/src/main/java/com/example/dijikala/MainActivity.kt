package com.example.dijikala

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dijikala.navigation.BottomNavigationBar
import com.example.dijikala.navigation.SetupNavGraph
import com.example.dijikala.ui.theme.DijikalaTheme
import com.example.dijikala.util.Constants.USER_LANGUAGE
import com.example.dijikala.util.LocaleUtils

class MainActivity : ComponentActivity() {


   private  lateinit var navController:NavHostController


    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DijikalaTheme {
                navController = rememberNavController()
                LocaleUtils.LocaleUtils.setLocale(LocalContext.current, USER_LANGUAGE)
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    Scaffold (

                        bottomBar = {
                            BottomNavigationBar(
                                navController = navController,
                                onItemClick ={
                                    navController.navigate(it.route)
                                })


                        }
                    ){
                        SetupNavGraph(navController = navController)
                    }




                }
            }
        }
    }


}

