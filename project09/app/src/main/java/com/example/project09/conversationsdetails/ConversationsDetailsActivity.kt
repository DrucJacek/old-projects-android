package com.example.project09.conversationsdetails

import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project09.databinding.ActivityConversationDetailsBinding

class ConversationsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =  ActivityConversationDetailsBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        val context = this
        with(binding){
            conversationRecyclerView.adapter =ConversationAdapter(messageList, 2)
            conversationRecyclerView.layoutManager = LinearLayoutManager(context)
        }

    }

    val messageList = arrayListOf<com.example.myapplicationwfegrmj.conversationsdetails.Message>(
        Message("no siemano mordeczko",1,R.drawable.img),
        Message("no siemano mordeczko",4,R.drawable.img),
        Message("no siemano mordeczko",1,R.drawable.img),
        Message("no siemano mordeczko",3,R.drawable.img),
        Message("no siemano mordeczko",2,R.drawable.img),
        Message("no siemano mordeczko",5,R.drawable.img),
        Message("no siemano mordeczko",3,R.drawable.img),
        Message("no siemano mordeczko",1,R.drawable.img),
        Message("no siemano mordeczko",2,R.drawable.img),
        Message("no siemano mordeczko",3,R.drawable.img),
        Message("no siemano mordeczko",4,R.drawable.img),
        )

}