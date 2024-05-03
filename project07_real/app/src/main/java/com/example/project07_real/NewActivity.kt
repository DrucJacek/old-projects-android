package com.example.project07_real

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.project07_real.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNewBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }
}