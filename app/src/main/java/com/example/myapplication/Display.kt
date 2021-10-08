package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Display :AppCompatActivity(){

    lateinit var fname : EditText;
    lateinit var lname : EditText;
    lateinit var email : EditText;
    lateinit var edit : Button;
    lateinit var contactlist :Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2);
        val bundle: Bundle? = intent.extras;
        fname=findViewById(R.id.d_fname);
        lname= findViewById(R.id.d_lname);
        email = findViewById(R.id.d_email);
        edit = findViewById(R.id.edit);
        contactlist = findViewById(R.id.contactlist);




        fname.setText(bundle!!.getString("f_name"));
        lname.setText(bundle!!.getString("l_name"));
        email.setText(bundle!!.getString("email_"));

        edit.setOnClickListener{
            val mainActivity_intent=Intent(this,MainActivity::class.java);
            startActivity(mainActivity_intent);
        }
        contactlist.setOnClickListener{
            val mainActivity_intent=Intent(this,ContactView::class.java);
            startActivity(mainActivity_intent);
        }

    }

}