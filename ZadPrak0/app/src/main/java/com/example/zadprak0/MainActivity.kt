package com.example.zadprak0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.zadprak0.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val haslo = binding.editTextHaslo.text.toString()
            val powtorzoneHaslo = binding.editTextPowHaslo.text.toString()

            if (!email.contains("@")) {
                binding.textViewWitaj.text = "Nieprawidłowy adres e-mail"
            } else if (haslo != powtorzoneHaslo) {
                binding.textViewWitaj.text = "Hasła się różnią"
            } else {
                binding.textViewWitaj.text = "Witaj $email"
            }
        }
    }
}