package com.example.dijikala

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dijikala.navigation.SetupNavGraph
import com.example.dijikala.ui.theme.DijikalaTheme

class MainActivity : ComponentActivity() {


   private  lateinit var navController:NavHostController

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DijikalaTheme {
                navController = rememberNavController()

                Scaffold (

                    bottomBar = {
                        //todo bottembar
                    }
                ){
                    SetupNavGraph(navController = navController)

                }

            }
        }
    }
}
