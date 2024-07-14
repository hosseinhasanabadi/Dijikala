package com.example.dijikala.ui.screen.home

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dijikala.data.modle.home.Slider
import com.example.dijikala.data.remote.NetworkResult
import com.example.dijikala.viewmodel.HomeViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun TopSlider(viewModel: HomeViewModel = hiltViewModel()){
    var list by remember {
        mutableStateOf<List<Slider>>(emptyList())
    }
    var loading by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = true){
        viewModel.Slider.collectLatest { result->
            when (result){
                is NetworkResult.Success ->{
                    result.data?.let {
                        list =it
                        Log.e("3636",list[0].image)
                    }
                    loading = false


                }
                is NetworkResult.Error ->{
                    loading = false
                    Log.e("3636","TopSlider error : ${result.message}")

                }
                is NetworkResult.Loading ->{
                    loading = true
                }
            }

        }

    }

}