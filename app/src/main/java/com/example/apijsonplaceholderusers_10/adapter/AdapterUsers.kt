package com.example.apijsonplaceholderusers_10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apijsonplaceholderusers_10.R
import com.example.apijsonplaceholderusers_10.modeljson.UsersJson

class AdapterUsers(

    /* Variáveis de Escopo Global: */
    private val context: Context,
    private var listUser: MutableList<UsersJson>

) : RecyclerView.Adapter<AdapterUsers.ViewHolderUser>() {

    class ViewHolderUser(var view: View) : RecyclerView.ViewHolder(view) {
        var nameTxtVw: TextView? = null
        var userName: TextView? = null
        var email: TextView? = null
        var phone: TextView? = null
        var website: TextView? = null
        var address: TextView? = null
        var street: TextView? = null
        var suite: TextView? = null
        var city: TextView? = null
        var zipcode: TextView? = null

        init {
            nameTxtVw = view.findViewById(R.id.txtVw_name_listItem_id)
            email = view.findViewById(R.id.txtVw_email_listItem_id)
            phone = view.findViewById(R.id.txtVw_phone_listItem_id)
            website = view.findViewById(R.id.txtVw_websSite_listItem_id)
            address = view.findViewById(R.id.txtVw_address_listItem_id)
            street = view.findViewById(R.id.txtVw_street_listItem_id)
            suite = view.findViewById(R.id.txtVw_suite_listItem_id)
            city = view.findViewById(R.id.txtVw_city_listItem_id)
            zipcode = view.findViewById(R.id.txtVw_zipcode_listItem_id)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUser {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.listitems_recyclerview, parent, false)
        return ViewHolderUser(view)
    }

    override fun onBindViewHolder(holder: ViewHolderUser, position: Int) {
        var userData = listUser.get(position)
        holder.nameTxtVw?.text = "Nome = " + userData.name
//        holder.email?.text = "• E - Mail = " + user.e
//        holder.phone?.text = "• Telefone = " + pokemon.phone
//        holder.website?.text = "• WebSite = " + pokemon.website
//        holder.city?.text = "• City = " + pokemon.address?.city
//        holder.street?.text = "• Street = " + pokemon.address?.street
//        holder.suite?.text = "• Suite = " + pokemon.address?.suite
//        holder.zipcode?.text = "• ZipCode = " + pokemon.address?.zipcode
    }

    override fun getItemCount(): Int {
        return listUser.size
    }
}