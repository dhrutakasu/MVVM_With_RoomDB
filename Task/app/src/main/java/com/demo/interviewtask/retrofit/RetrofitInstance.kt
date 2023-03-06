package com.demo.interviewtask.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitInstance {
//    https://run.mocky.io/v3/4fe37a6e-3d88-4ec9-af04-759917b8b9dc
    val api : DataApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://run.mocky.io/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DataApi::class.java)
    }
}