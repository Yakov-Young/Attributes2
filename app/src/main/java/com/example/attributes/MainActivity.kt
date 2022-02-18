package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: TextView = findViewById(R.id.editText)
        val buttonBlackT: Button = findViewById(R.id.button)
        val buttonRedT: Button = findViewById(R.id.button4)
        val button8: Button = findViewById(R.id.button2)
        val button24: Button = findViewById(R.id.button5)
        val buttonWhite: Button = findViewById(R.id.button3)
        val buttonYellow: Button = findViewById(R.id.button6)

        button8.setOnClickListener {
            editText.setTextSize(8F);
        }

        button24.setOnClickListener {
            editText.setTextSize(24F);
        }

        buttonRedT.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonBlackT.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonWhite.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellow.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}