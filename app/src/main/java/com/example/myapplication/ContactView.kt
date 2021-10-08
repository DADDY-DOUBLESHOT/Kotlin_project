package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.text.Layout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R.id.mainview
import com.example.myapplication.R.layout.contacts;
import com.example.myapplication.R.layout.contacts.mainview;


class ContactView : AppCompatActivity() {

    var layoutManager = LinearLayoutManager(this);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(contacts);
        layoutManager.orientation=LinearLayoutManager.VERTICAL;
        mainview.layoutManager=layoutManager;
        val adapter =ContactsAdapter(this,loadData.contactList);
        mainview.adapter=adapter;

    }

}