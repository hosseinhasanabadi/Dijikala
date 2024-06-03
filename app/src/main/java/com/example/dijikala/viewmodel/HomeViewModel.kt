package com.example.dijikala.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dijikala.data.modle.home.Slider
import com.example.dijikala.data.remote.NetworkResult
import com.example.dijikala.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository):ViewModel(){
    val Slider = MutableStateFlow<NetworkResult<List<Slider>>>(NetworkResult.Loading())
    suspend fun getSlider(){
        viewModelScope.launch {
            Slider.emit( repository.getSlider())
        }

    }

}