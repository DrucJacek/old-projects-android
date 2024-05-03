package com.example.projekt05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.projekt05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        //setContentView(R.layout.activity_main)


        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this,"blabla",Toast.LENGTH_LONG)
        }
    }

//    fun onClickButtonAction(view: View){
//        println("on click")
//
//    }
}