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
    private val context: Context, private var listPokemon:
    MutableList<UsersJson>
) : RecyclerView.Adapter<AdapterUsers.ViewHolderPokemon>() {

    class ViewHolderPokemon(var view: View) : RecyclerView.ViewHolder(view) {

        var name: TextView? = null
        var userName: TextView? = null
        var email: TextView? = null
        var phone: TextView? = null
        var website: TextView? = null


        init {
            name = view.findViewById(R.id.txtVw_name_listItem_id)
            userName = view.findViewById(R.id.txtVw_userName_listItem_id)
            email = view.findViewById(R.id.txtVw_email_listItem_id)
            phone = view.findViewById(R.id.txtVw_phone_listItem_id)
            website = view.findViewById(R.id.txtVw_websSite_listItem_id)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPokemon {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.listitems_recyclerview, parent, false)
        return ViewHolderPokemon(view)
    }

    override fun onBindViewHolder(holder: ViewHolderPokemon, position: Int) {
        var pokemon = listPokemon.get(position)
        holder.name?.text = "Nome = " + pokemon.name
        holder.userName?.text = "• UserName = " + pokemon.userName
        holder.email?.text = "• E - Mail = " + pokemon.eMail
        holder.phone?.text = "• Telefone = " + pokemon.phone
        holder.website?.text = "• WebSite = " + pokemon.website
    }

    override fun getItemCount(): Int {
        return listPokemon.size
    }
}