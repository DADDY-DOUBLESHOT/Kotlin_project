package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ContactView : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts);

        val bundle :Bundle?=intent.extras;

        bundle?.let {
            val fname=bundle.getString("fname");
            val lname=bundle.getString("lname");

            val recyclerview=findViewById<RecyclerView>(R.id.mainview);
            val data=ArrayList<Model>();
            val adapter =ContactsAdapter(data);
            recyclerview.layoutManager=LinearLayoutManager(this);

            data.addAll(loadData.contactList);
            data.add(Model("demo ","item 1  "))
            data.add(Model("demo ","item 2 "))
            data.add(Model(fname.toString(),lname.toString()));
            recyclerview.adapter=adapter;



        }




    }

}
