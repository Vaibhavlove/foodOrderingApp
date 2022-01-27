package com.example.newapp11

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_main.*

class home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        supportActionBar?.hide()


        val button = findViewById<Button>(R.id.button)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        val learnMore = findViewById<TextView>(R.id.LearnMore)



        button.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/restaurants/burger?category=1")

        })
        button1.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/restaurants/burger?category=1")

        })

        button2.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/restaurants/pizza?category=1")

        })

        button3.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/restaurants/biryani?category=1")

        })

        button4.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/delivery?dishv2_id=685264563da6563c03f42000a7ec9f06_2")

        })

        button5.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/delivery?dishv2_id=685264563da6563c03f42000a7ec9f06_2")

        })

        button6.setOnClickListener(View.OnClickListener {

            gotoUrl("https://www.zomato.com/pune/restaurants/south-indian?category=1")

        })

    }

    private fun gotoUrl(s: String) {

        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW,uri))
    }


    fun onclick(V:View)
    {
        gotoUrl("https://www.zomato.com/who-we-are")
    }
}