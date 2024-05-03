package com.example.project11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import com.example.project11.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val dataStoreManager : DataStoreManager = DataStoreManager(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this ))
        setContentView(binding.root)

        lifecycleScope.launch {
            dataStoreManager.getUserName().collect {
                if (!TextUtils.isEmpty(it)){
                    openLogedActivity()
                }
            }
        }

//        val context = this
        with(binding){
          loginButton.setOnClickListener {
              val username = editTextTextPersonName.text.toString()

              lifecycleScope.launch {
                  dataStoreManager.saveUserName(username)
                  openLogedActivity()
              }


          }
        }
    }

    private fun openLogedActivity() {
        val intent = Intent(this, LogedUserActivity::class.java)
        startActivity(intent)
    }
}