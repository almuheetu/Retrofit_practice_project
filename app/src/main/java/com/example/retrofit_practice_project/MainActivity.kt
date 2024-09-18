package com.example.retrofit_practice_project

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofit_practice_project.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val responseApi = RetrofitHelper
            .getInstance()
            .create(ResponseApi::class.java)
        GlobalScope.launch {
            val result = responseApi.getResponse()
            if (result != null)

                Log.d("Log404", "+" + result.body().toString())
        }
    }
}
