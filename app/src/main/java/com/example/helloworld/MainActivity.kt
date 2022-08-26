package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        val colorButton = findViewById<Button>(R.id.colorButton)
        val introText = findViewById<TextView>(R.id.introTextView)

        button.setOnClickListener {
            Log.v("Helloworld", "Button clicked!")
            Toast.makeText(this, "Hello to you too", Toast.LENGTH_SHORT).show()
        }

        colorButton.setOnClickListener {
            Toast.makeText(this, "Color Changed", Toast.LENGTH_SHORT).show()
            introText.setTextColor(Color.parseColor("magenta"))
        }

    }
}