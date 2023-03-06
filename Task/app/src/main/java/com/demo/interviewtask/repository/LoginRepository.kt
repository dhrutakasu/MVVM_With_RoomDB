package com.demo.interviewtask.repository

import android.content.Context
import android.content.Intent
import androidx.lifecycle.LiveData
import com.demo.interviewtask.model.LoginTableModel
import com.demo.interviewtask.room.LoginDatabase
import com.demo.interviewtask.view.WelcomeScreenActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class LoginRepository {

    companion object {

        var loginDatabase: LoginDatabase? = null
        var loginTableModel: LiveData<LoginTableModel>? = null
        private fun initializeDB(context: Context) : LoginDatabase {
            return LoginDatabase.getDataseClient(context)
        }
        fun insertData(context: Context, username: String, password: String) {
            loginDatabase = initializeDB(context)

            CoroutineScope(IO).launch {
                val loginDetails = LoginTableModel(username, password)
                loginDatabase!!.loginDao().InsertData(loginDetails)
                context.startActivity(Intent(context, WelcomeScreenActivity::class.java).putExtra("Username",username))
            }
        }

        fun getLoginDetails(context: Context, username: String) : LiveData<LoginTableModel>? {

            loginDatabase = initializeDB(context)

            loginTableModel = loginDatabase!!.loginDao().getLoginDetails(username)

            return loginTableModel
        }

    }
}