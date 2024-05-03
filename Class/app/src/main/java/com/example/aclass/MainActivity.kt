package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.example.aclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        var lista = arrayListOf<User>()
        val arrayAdapter : ArrayAdapter<User>
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, lista)
        with (binding) {
            listViewOsoby.adapter = arrayAdapter
            buttonDodaj.setOnClickListener {
                if ((editTextName.text.isNotEmpty())&&(editTextSurname.text.isNotBlank())){
                    val gender: Int = grupaRadio.checkedRadioButtonId
                    lista.add(User(editTextName.text.toString(),editTextSurname.text.toString(),editTextLogin.text.toString(),grupaRadio.checkedRadioButtonId))
                    arrayAdapter.notifyDataSetChanged()
                }
                listViewOsoby.adapter = arrayAdapter
            }
        }
    }
}