package com.example.film3

import android.app.Application
import com.example.film3.Interface.RetrofitServices

class App: Application() {
    val retrofitServices = RetrofitServices()
}