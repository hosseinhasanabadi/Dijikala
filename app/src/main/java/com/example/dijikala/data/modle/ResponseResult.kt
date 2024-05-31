package com.example.dijikala.data.modle

data class ResponseResult<T>(
    val message:String,
    val data:T,
    val success:Boolean
)
