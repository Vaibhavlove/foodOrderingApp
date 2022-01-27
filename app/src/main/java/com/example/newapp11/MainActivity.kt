package com.example.newapp11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.login);

        login.setOnClickListener {
            val i = Intent(this,login_Activity::class.java)
            startActivity(i)
        }

        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            val j = Intent(this,signUp_Activity::class.java)
            startActivity(j)
        }
    }
}