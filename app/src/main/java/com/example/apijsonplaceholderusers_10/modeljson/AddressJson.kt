package com.example.apijsonplaceholderusers_10.modeljson

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AddressJson (

    @SerializedName("street")
    var street: String? = null,

    @SerializedName("suite")
    var suite: String? = null,

    @SerializedName("city")
    var city: String? = null,

    @SerializedName("zipcode")
    var zipcode: String? = null

) : Serializable