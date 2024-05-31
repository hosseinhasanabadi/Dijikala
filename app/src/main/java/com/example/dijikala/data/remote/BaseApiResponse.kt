package com.example.dijikala.data.remote

import com.example.dijikala.data.modle.ResponseResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

abstract class BaseApiResponse {
    suspend fun <T> safeApiCall(apiCall: suspend () -> Response<ResponseResult<T>>): NetworkResult<T> =
        withContext(Dispatchers.IO){
            try {
                val response = apiCall()
                if (response.isSuccessful) {
                    val body = response.body()
                    body?.let {
                        return@withContext NetworkResult.Success(body.message, body.data)
                    }
                }

                return@withContext error("code:${response.code()},message :${response.code()}")
            } catch (e: Exception) {
                return@withContext error(e.message?:e.toString())
            }
        }



    private fun <T> error(errorMessage:String) : NetworkResult<T> =
        NetworkResult.Error("Api call faild:$errorMessage")
}