package com.example.dijikala.ui.screen

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.dijikala.MainActivity
import com.example.dijikala.util.Constants.ENGLISH_LANG
import com.example.dijikala.util.Constants.PERSIAN_LANG
import com.example.dijikala.viewmodel.DataStoreViewModel

@Composable
fun ProfileScreen(navController: NavHostController
,dataStore: DataStoreViewModel= hiltViewModel()
                  ){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center
    ) {
        val activity = LocalContext.current as Activity


        Text(text = "ProfileScreen")

        Button(onClick = {
            dataStore.saveUserLanguage(PERSIAN_LANG)
            activity.apply {
               finish()
                startActivity(Intent(activity,MainActivity::class.java))

            }


        }) {
            Text(text = "fa")

        }
        Button(onClick = {
            dataStore.saveUserLanguage(ENGLISH_LANG)
            activity.apply {
                finish()
                startActivity(Intent(activity, MainActivity::class.java))
            }

        }) {
            Text(text = "en")

        }

    }
}