package com.example.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.Button)
        val num = findViewById<TextView>(R.id.h)

        button.setOnClickListener {
            count++
            num.text = count.toString()
        }
    }
}