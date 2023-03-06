package com.demo.interviewtask.retrofit

import com.demo.interviewtask.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface DataApi {
    @GET("jKVv22p8")
    fun getData() : Call<DataModel>
}
