package com.example.dijikala.data.remote

import com.example.dijikala.data.modle.ResponseResult
import com.example.dijikala.data.modle.home.Slider
import retrofit2.Response
import retrofit2.http.GET

interface HomeApiInterface  {
    @GET("v1/getSlider")
    suspend fun getSlider():Response<ResponseResult<List<Slider>>>
}