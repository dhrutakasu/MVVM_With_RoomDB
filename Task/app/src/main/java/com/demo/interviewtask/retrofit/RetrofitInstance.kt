package com.demo.interviewtask.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitInstance {
    val api : DataApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://pastebin.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DataApi::class.java)
    }
}