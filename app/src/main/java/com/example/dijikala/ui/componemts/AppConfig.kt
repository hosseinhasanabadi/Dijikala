package com.example.dijikala.ui.componemts

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dijikala.util.Constants.USER_LANGUAGE
import com.example.dijikala.viewmodel.DataStoreViewModel

@Composable
fun AppConfig(
    dataStore:DataStoreViewModel = hiltViewModel()
){
    getDataStoreVariables(dataStore)


}

private fun getDataStoreVariables(dataStore: DataStoreViewModel) {
    USER_LANGUAGE = dataStore.getUserLanguage()
    dataStore.saveUserLanguage(USER_LANGUAGE)
}