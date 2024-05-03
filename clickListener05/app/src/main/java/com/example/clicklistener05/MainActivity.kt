package com.example.clicklistener05

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.widget.Button
import com.example.clicklistener05.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        findViewById<Button>(R.id.zielony).setOnClickListener {
//            findViewById<Layout>(R.id.layout).setBackgroundResource(R.color.zielony)
//
//        }
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with(binding) {
            buttonzolty.setOnClickListener {
                layout.setBackgroundColor(getColor(R.color.zolty))
            }
            zielony.setOnClickListener {
                layout.setBackgroundColor(getColor(R.color.zielony))
            }
            layout.setOnClickListener {
                layout.setBackgroundColor(Color.WHITE)
            }
        }
    }
}