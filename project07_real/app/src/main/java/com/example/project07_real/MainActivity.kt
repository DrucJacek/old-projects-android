package com.example.project07_real

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.example.project07_real.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val context = this

        with(binding){

            buttonNewActivity.setOnClickListener {
                val newIntent = Intent(context, NewActivity::class.java)
                startActivity(newIntent)
            }

            buttonE.setOnClickListener {
                val emailArrray:Array<String> = arrayOf("travelagentsupport@kkk.com")
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("mailto:")
                intent.putExtra(Intent.EXTRA_EMAIL, emailArrray)
                intent.putExtra(Intent.EXTRA_SUBJECT, "Inquire about travel agent")
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        }
    }
}