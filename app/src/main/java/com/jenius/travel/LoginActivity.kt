package com.jenius.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


// : means extend from superclass
class LoginActivity : AppCompatActivity() {

    //method yang wajib dari AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_signin.setOnClickListener {
            //do something when button is clicked
            //val --> immutable
            //var --> mutable
            val username = input_username.text.toString();

//            Toast.makeText(this, "Hello $username, Welcome Back!",
//                Toast.LENGTH_SHORT).show();

            val intent = Intent(this, MainActivity::class.java);
            intent.putExtra("username", username);
            startActivity(intent);
        }
    }
}
