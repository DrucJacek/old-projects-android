package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        var lista = arrayListOf<String>()
        with(binding) {
            buttonDodaj.setOnClickListener {
                lista.add(editTextText2.text.toString())
                Toast.makeText(this@MainActivity, lista.size.toString(), Toast.LENGTH_SHORT).show()
                editTextText2.text.clear()
            }
            switch1.setOnCheckedChangeListener { compoundButton, isChecked ->
                if (isChecked) {
                    editTextText2.setText(editTextText2.text.toString().uppercase())
                    switch1.text = "Małe"
                } else {
                    editTextText2.setText(editTextText2.text.toString().lowercase())
                    switch1.text = "Duże"
                }
            }
            buttonPrzejdz.setOnClickListener {
                val intent = Intent(this@MainActivity,ListaActivity::class.java)
                intent.putExtra("lysta",lista)
                startActivity(intent)
            }
        }
    }
}