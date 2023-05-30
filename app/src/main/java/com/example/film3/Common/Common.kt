package com.example.film3.Common

import com.example.film3.Interface.RetrofitServices
import com.example.film3.Retrofit.RetrofitClient


object Common {
    private val BASE_URL = "https://imdb-api.com/en/API/Top250Movies"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}