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

/* ▬▬▬ Essa Classe de Mapeamento JSON foi criada pelo Programa JSON2 ANY ▬▬▬*/
//class UsersJsonXXXXXX {
//    var id = 0
//    var name: String? = null
//    var username: String? = null
//    var email: String? = null
//    var address: Address? = null
//    var phone: String? = null
//    var website: String? = null
//    // var company: Company? = null
//}
//
//class AddressXXXX {
//    var street: String? = null
//    var suite: String? = null
//    var city: String? = null
//    var zipcode: String? = null
//    // var geo: Geo? = null
//}//
//
//class Geo {
//    var lat: String? = null
//    var lng: String? = null
//}//
//
//class Company {
//    var name: String? = null
//    var catchPhrase: String? = null
//    var bs: String? = null
//}









