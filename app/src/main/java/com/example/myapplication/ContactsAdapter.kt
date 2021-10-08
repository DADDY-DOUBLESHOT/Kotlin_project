package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class  ContactsAdapter(val context: Context,val contactList :List<Contacts>) :RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.contactview,parent,false);
        return ContactsViewHolder(view);

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {

        val contact=contactList[position]
        holder.setData(contact,position);

    }

    override fun getItemCount(): Int {

        return  contactList.size;
    }

    inner class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
            fun setData(contact: Contacts?,pos: Int)
            {
                    itemView.findViewById<TextView>(R.id.txvTitle).text=contact!!.fname;
            }
    }
}