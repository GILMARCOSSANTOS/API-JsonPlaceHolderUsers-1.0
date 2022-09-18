package com.example.apijsonplaceholderusers_10.modeljson

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UsersJson(

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("username")
    val userName: String? = null,

    @SerializedName("email")
    val eMail: String? = null,

    @SerializedName("phone")
    val phone: String? = null,

    @SerializedName("website")
    val website: String? = null,

    var address: Address? = null

) : Serializable

class Address(

    @SerializedName("street")
    var street: String? = null,

    @SerializedName("suite")
    var suite: String? = null,

    @SerializedName("city")
    var city: String? = null,

    @SerializedName("zipcode")
    var zipcode: String? = null

) : Serializable
