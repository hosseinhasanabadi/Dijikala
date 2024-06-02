package com.example.dijikala.repository

import com.example.dijikala.data.remote.BaseApiResponse
import com.example.dijikala.data.remote.HomeApiInterface
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api : HomeApiInterface):BaseApiResponse() {


}