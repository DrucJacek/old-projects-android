package com.example.project12

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.app.NotificationCompat
import com.example.project12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        with(binding) {
            buttonN.setOnClickListener {
                showNotification()
            }
        }


    }
    fun showNotification() {
        val myChannelId = "my_channel"
        val notificationChannel : NotificationChannel =
            NotificationChannel(myChannelId, "My channel", NotificationManager.IMPORTANCE_HIGH)

        notificationChannel.description = "My channel description"

        val notificationManager : NotificationManager =
            this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.createNotificationChannel(notificationChannel)

        val notificationBuilder = NotificationCompat.Builder(this, myChannelId)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle("Moja pierwsza notyfikacja")
            .setContentText("Hej hej hello")
            .setPriority(NotificationCompat.PRIORITY_MAX)

        notificationManager.notify(12, notificationBuilder.build())
    }
}