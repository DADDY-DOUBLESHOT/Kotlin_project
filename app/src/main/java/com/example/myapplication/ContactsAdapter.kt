package com.example.myapplication

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class  ContactsAdapter(val items:List<Model>) : RecyclerView.Adapter<ContactsAdapter.ContactsHolder>()
{



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.contactview,parent,false);
        return ContactsHolder(view);

    }

    override fun onBindViewHolder(holder: ContactsHolder, position: Int) {

        val curritem=items[position]
//        holder.title.text=curritem.title
        holder.setData(curritem,position);



    }

    override fun getItemCount(): Int {

        return items.size;
    }


    class ContactsHolder(itemView :View): ViewHolder(itemView)
    {
        var title : Model?=null
        var pos : Int=0

        fun setData(curritem : Model,pos :Int)
        {
            curritem?.let{
                itemView.findViewById<TextView>(R.id.fname).text=curritem.fname
                itemView.findViewById<TextView>(R.id.lname).text=curritem.lname

            }

            this.title=curritem;
            this.pos=pos;

        }
    }
}