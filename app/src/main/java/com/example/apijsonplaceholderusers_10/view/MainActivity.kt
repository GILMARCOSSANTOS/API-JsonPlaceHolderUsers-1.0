package com.example.apijsonplaceholderusers_10.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apijsonplaceholderusers_10.R
import com.example.apijsonplaceholderusers_10.adapter.AdapterUsers
import com.example.apijsonplaceholderusers_10.api.ApiUrlBase
import com.example.apijsonplaceholderusers_10.modeljson.UsersJson
import com.google.android.material.textview.MaterialTextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var listUsersJson: MutableList<UsersJson> = mutableListOf<UsersJson>()
    private var adapterUsers: AdapterUsers? = null
    private lateinit var recyclerViewUsers: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Functions: */
        centerTitleActionBar()
        settingsRecyclerViewUsers()
        getUsersApi()
    }

    private fun settingsRecyclerViewUsers() {
        listUsersJson = mutableListOf()
        recyclerViewUsers = findViewById(R.id.rcclrVw_actvtMain_id)

        recyclerViewUsers.layoutManager = LinearLayoutManager(this@MainActivity)
        adapterUsers = AdapterUsers(
            this,
            listUsersJson
        )
        recyclerViewUsers.adapter = adapterUsers
    }

    private fun getUsersApi() {
        ApiUrlBase.apiServiceUsers.getUsersEndUrl()
            .enqueue(object :
            Callback<MutableList<UsersJson>> {
            override fun onResponse(
                call: Call<MutableList<UsersJson>>,
                response: Response<MutableList<UsersJson>>
            ) {
                val responseUseres = response.body()
                listUsersJson.clear()
                responseUseres?.let {
                    listUsersJson.addAll(it)
                    adapterUsers?.notifyDataSetChanged()
                    println("Resposta da API = " + responseUseres)
                }
            }
            override fun onFailure(call: Call<MutableList<UsersJson>>, t: Throwable) {
                Log.e("Error", t.localizedMessage)
            }
        })
    }

    private fun centerTitleActionBar() {
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.actionbar_centertitle)
    }
}