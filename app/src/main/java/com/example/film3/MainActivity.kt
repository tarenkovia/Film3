package com.example.film3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.film3.Adapter.MyMovieAdapter
import com.example.film3.Interface.RetrofitServices
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.film3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyMovieAdapter

    private val retrofitServices: RetrofitServices
        get() = (applicationContext as App)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        adapter = MyMovieAdapter()

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerMovieList.layoutManager = layoutManager
        binding.recyclerMovieList.adapter = adapter

    }
}