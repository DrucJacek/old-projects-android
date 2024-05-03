package com.example.project11

import android.os.Bundle
import android.os.PersistableBundle
import android.text.TextUtils
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.project11.databinding.ActivityLogedUserBinding
import kotlinx.coroutines.launch

class LogedUserActivity : AppCompatActivity() {

    val dataStoreManager : DataStoreManager = DataStoreManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLogedUserBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)



        lifecycleScope.launch {
            dataStoreManager.getUserName().collect {
                if (!TextUtils.isEmpty(it)){
                    binding.welcomeMessage.text = "Cześć $it"
                }
            }
        }
    }
}