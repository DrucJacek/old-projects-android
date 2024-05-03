package com.example.egzaminkawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.egzaminkawa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
         setContentView(binding.root)
            val powrot = findViewById<Button>(R.id.powrot)
            val zatwierdz = findViewById<Button>(R.id.zatwierdz)

        with(binding) {
            fun resetImagesAlpha() {
                americano.alpha = 1.0f
                cappuccino.alpha = 1.0f
                espresso.alpha = 1.0f
            }

            americano.setOnClickListener {
                resetImagesAlpha()
                cappuccino.alpha = 0.5f
                espresso.alpha = 0.5f


            }

            cappuccino.setOnClickListener {
                resetImagesAlpha()
                americano.alpha = 0.5f
                espresso.alpha = 0.5f
            }

            espresso.setOnClickListener {
                resetImagesAlpha()
                americano.alpha = 0.5f
                cappuccino.alpha = 0.5f
            }
            root.setOnClickListener {
                resetImagesAlpha()
            }


            binding.zamawiam.setOnClickListener{
                setContentView(R.layout.activity_zamowienie)
            }

           powrot.setOnClickListener {
               val intent = Intent(this, MainActivity::class.java)
               startActivity(intent)
           }

            // Dodanie OnClickListener
            zatwierdz.setOnClickListener {
                val message = "Zamówienie kawy zostało zatwierdzone!"
                Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
            }

        }
    }
}