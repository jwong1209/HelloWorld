package com.example.helloworld

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        val colorButton = findViewById<Button>(R.id.colorButton)
        val introText = findViewById<TextView>(R.id.introTextView)
        val keyboard = findViewById<TextInputEditText>(R.id.textKeyBoard)

        fun hideSoftKeyboard(view: View) {
            val imm =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }

        button.setOnClickListener {
            Log.v("Helloworld", "Button clicked!")
            if(keyboard.text != null && keyboard.text.toString() != "") {
                Toast.makeText(this, "Hello " + keyboard.text + ".\nNice to "
                        + "meet you.", Toast.LENGTH_SHORT).show()
                keyboard.setText("")
                hideSoftKeyboard(keyboard)
            }
            else {
            Toast.makeText(this, "Hello, nice to meet you.", Toast.LENGTH_SHORT).show()
            }
        }

        colorButton.setOnClickListener {
            Toast.makeText(this, "Color Changed", Toast.LENGTH_SHORT).show()
            introText.setTextColor(Color.parseColor("magenta"))
        }

    }
}