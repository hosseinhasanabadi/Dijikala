package com.example.dijikala.repository

import com.example.dijikala.data.modle.home.Slider
import com.example.dijikala.data.remote.BaseApiResponse
import com.example.dijikala.data.remote.HomeApiInterface
import com.example.dijikala.data.remote.NetworkResult

import javax.inject.Inject

class HomeRepository @Inject constructor(private val api : HomeApiInterface):BaseApiResponse() {
    suspend fun getSlider():NetworkResult<List<Slider>> =
        safeApiCall {
            api.getSlider()
        }



}