package com.example.project06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebViewClient
import com.example.project06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            println("IsChecked = $isChecked")

//            if (isChecked){
//                binding.container.setBackgroundColor(getColor(R.color.black))
//            } else {
//                binding.container.setBackgroundColor(getColor(R.color.white))
//            }


            if (isChecked){
                binding.editTextText3.visibility = View.VISIBLE
            } else {
                binding.editTextText3.visibility = View.INVISIBLE
            }
        }

        binding.webview.webViewClient = WebViewClient()
        binding.webview.loadUrl("https://technikum.infotech.edu.pl/")

    }
}