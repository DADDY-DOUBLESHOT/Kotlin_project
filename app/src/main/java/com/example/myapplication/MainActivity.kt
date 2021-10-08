package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*
import kotlin.concurrent.timer


class MainActivity : AppCompatActivity() {



    lateinit var fname: EditText;
    lateinit var lname: EditText;
    lateinit var email: EditText;
    lateinit var show: Button;
    lateinit var reset: Button;
    lateinit var bg: LinearLayout;
    lateinit var share:Button;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        show=findViewById(R.id.show);
        reset=findViewById(R.id.reset);
        share=findViewById(R.id.share);
        bg=findViewById(R.id.parent);


        val animatebg= bg.background as AnimationDrawable;


        animatebg.setEnterFadeDuration(1000);
        animatebg.setExitFadeDuration(1000);

        show.setOnClickListener {
            Toast.makeText(this,""+fname.text+" "+lname.text+" "+email.text,Toast.LENGTH_SHORT).show();
            animatebg.start();
            val display_switch=Intent(this,Display::class.java);
            display_switch.putExtra("f_name",fname.text.toString());
            display_switch.putExtra("l_name",lname.text.toString());
            display_switch.putExtra("email_",email.text.toString());
            startActivity(display_switch);
        }


        reset.setOnClickListener {
            fname.setText("");
            lname.setText("");
            email.setText("");

            animatebg.stop();
            Toast.makeText(this,"Reset Successful ",Toast.LENGTH_SHORT).show();


        }

        share.setOnClickListener {
            val intent =Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT,"FullName :"+fname.text+" "+lname.text+"\n"+"Email : "+email.text);
            intent.type="text/plain";
            startActivity(Intent.createChooser(intent,"Share on : "));
        }

    }
}