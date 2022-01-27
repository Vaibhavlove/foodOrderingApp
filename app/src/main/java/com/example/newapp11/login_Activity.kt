package com.example.newapp11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login = findViewById<Button>(R.id.login1)
        val email = findViewById<EditText>(R.id.EmailAddress)
        val Password = findViewById<EditText>(R.id.Password)



        login.setOnClickListener {

            val username = email.text.toString()
            val password = Password.text.toString()
            if (username == "vaibhavlomte@gmail.com" && password == "9307377082") {
                val intent = Intent(this@login_Activity, home_page::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(applicationContext,"wrong username or password",Toast.LENGTH_SHORT).show()
            }
        }
    }
}