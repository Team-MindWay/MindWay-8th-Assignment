package com.example.android_counter

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android_counter.databinding.ActivityMainBinding
import java.io.Closeable



class   MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    var add: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btCut.setOnClickListener{
            add++
            binding.tvNum.text = add.toString()

        }
    }
}
