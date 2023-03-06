package com.demo.interviewtask.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demo.interviewtask.model.DataModel
import com.demo.interviewtask.model.Problems
import com.demo.interviewtask.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.sql.DriverManager.println

class WelcomeViewModel : ViewModel() {
    private var movieLiveData = MutableLiveData<List<Problems>>()
    fun getPopularMovies() {
        RetrofitInstance.api.getData().enqueue(object  : Callback<DataModel> {
            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                println("TAG Enter "+ response.body()!!.problems!![0].Diabetes!![0].medications!![0].medicationsClasses!![0].className2!![0].associatedDrug2!![1].toString())
                if (response.body()!=null){
                    movieLiveData.value = response.body()!!.problems
                }
                else{
                    return
                }
            }
            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }
        })
    }
    fun observeJsonData() : LiveData<List<Problems>> {
        return movieLiveData
    }
}
