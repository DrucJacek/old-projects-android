package com.example.heroesspeedtest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.heroesspeedtest.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        var czas:Long = 0
        var start = false
        with(binding) {
            buttonStart.setOnClickListener {
                linearLayoutProstokat.setBackgroundColor(Color.RED)
                linearLayoutProstokat.postDelayed(Runnable{
                    linearLayoutProstokat.setBackgroundColor(Color.GREEN)
                    czas = System.currentTimeMillis()
                    start = true
                }, Random.nextLong(1000, 3000))

            }


            linearLayoutProstokat.setOnClickListener{

                if (start) {
                    var reakcja = System.currentTimeMillis() - czas
                    textViewWynik.setText("Twój wynik to:" + reakcja.toString())
                }





            }

        }
    }
}