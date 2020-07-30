package com.jenius.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


// : means extend from superclass
class MainActivity : AppCompatActivity() {

    //method yang wajib dari AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_signin.setOnClickListener {
            //do something when button is clicked
            //val --> immutable
            //var --> mutable
            val username = input_username.text.toString();

            Toast.makeText(this, "Hello $username, Welcome Back!",
                Toast.LENGTH_SHORT).show();
        }
    }
}
