package com.example.assignment4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.b1)
        val button2: Button = findViewById(R.id.b2)
        val button3: Button = findViewById(R.id.b3)


        button1.setOnClickListener {
            counter++
            textView.text = "Counter: $counter"
        }


        button2.setOnClickListener {
            val layoutParams = textView.layoutParams
            layoutParams.height = 2000
            textView.layoutParams = layoutParams
        }


        button3.setOnClickListener {
            val layoutParams = textView.layoutParams as LinearLayout.LayoutParams
            layoutParams.gravity = Gravity.CENTER
            textView.layoutParams = layoutParams
        }
    }
}
