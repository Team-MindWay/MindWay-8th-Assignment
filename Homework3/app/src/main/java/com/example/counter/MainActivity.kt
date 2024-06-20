package com.example.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun main(){
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.bt_cut)
        val num = findViewById<TextView>(R.id.tv_num)
        var add :Int = 0
        button.setOnClickListener(){
            add++
            num.text = add.toString()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main()
    }
}