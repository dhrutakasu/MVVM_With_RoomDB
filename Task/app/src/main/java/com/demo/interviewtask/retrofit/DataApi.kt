package com.demo.interviewtask.retrofit

import com.demo.interviewtask.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface DataApi {
    @GET("4fe37a6e-3d88-4ec9-af04-759917b8b9dc")
    fun getData() : Call<DataModel>
}
