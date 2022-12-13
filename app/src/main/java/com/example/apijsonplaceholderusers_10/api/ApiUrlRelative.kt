package com.example.apijsonplaceholderusers_10.api

import com.example.apijsonplaceholderusers_10.modeljson.UsersJson
import retrofit2.Call
import retrofit2.http.GET

interface ApiUrlRelative {

    @GET("users")
    fun getUsersEndUrl(): Call<MutableList<UsersJson>>
}