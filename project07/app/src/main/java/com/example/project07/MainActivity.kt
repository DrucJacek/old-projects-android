package com.example.project07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.project07.databinding.ActivityMainBinding
import com.example.project07.databinding.SecondLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val binding2 = SecondLayoutBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with (binding) {
            button.setOnClickListener {
                setContentView(binding2.root)
            }
        }
    }
}