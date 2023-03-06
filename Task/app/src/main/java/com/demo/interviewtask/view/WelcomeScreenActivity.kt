package com.demo.interviewtask.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.demo.interviewtask.R
import com.demo.interviewtask.viewmodel.LoginViewModel
import com.demo.interviewtask.viewmodel.WelcomeViewModel
import kotlinx.android.synthetic.main.activity_welcome_screen.*

class WelcomeScreenActivity : AppCompatActivity() {
    lateinit var welcomeViewModel: WelcomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        welcomeViewModel = ViewModelProvider(this)[WelcomeViewModel::class.java]

        var strUsername = intent.getStringExtra("Username")
        lblWelcomeHeading.text = String.format("Welcome to %s", strUsername)
        welcomeViewModel.getPopularMovies()
        welcomeViewModel.observeJsonData()
    }
}