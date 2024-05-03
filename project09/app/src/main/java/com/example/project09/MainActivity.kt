package com.example.project09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.project09.databinding.ActivityMainBinding
import com.example.project09.userlist.UserListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val context = this

        with(binding){
            openUsersListButton.setOnClickListener {
                val intent = Intent(context, UserListActivity::class.java)
                startActivity(intent)
            }
//                czas: 6:51
        }
    }

}

