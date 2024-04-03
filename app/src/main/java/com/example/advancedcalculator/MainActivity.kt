package com.example.advancedcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arithmaticBtn=findViewById<AppCompatButton>(R.id.Arithmatic_Btn)
        arithmaticBtn.setOnClickListener { // Create an Intent to navigate to the new activity
            val intent = Intent(this@MainActivity, arithmatic::class.java)

            // Start the new activity
            startActivity(intent)
        }
    }
}