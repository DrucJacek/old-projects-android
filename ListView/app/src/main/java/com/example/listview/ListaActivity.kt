package com.example.listview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListaBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        var lista = ArrayList<String>()
        lista = intent.getStringArrayListExtra("lysta")!!
        val arrayAdapter:ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, lista)

        with (binding) {
            listView1.adapter = arrayAdapter
            button.setOnClickListener {
                val intent = Intent(this@ListaActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}