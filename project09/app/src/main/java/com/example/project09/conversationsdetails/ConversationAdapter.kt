package com.example.project09.conversationsdetails

import android.icu.number.IntegerWidth
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.project09.R
import com.example.project09.userlist.UserItemViewHolder

class ConversationAdapter(val messageList: ArrayList<Message>, val myUserId: Int) :  RecyclerView.Adapter<ConversationViewHolder>(){

    override fun getItemViewType(position: Int): Int {

        val messageObject = messageList.get(position)

        if (myUserId == messageObject.userId) {
            return 1
        } else {
            return 2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversationViewHolder {

        if (viewType == 1) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_my_message, parent, false)

            return ConversationViewHolder(view)

        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_message_from, parent, false)

            return ConversationViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }





    override fun onBindViewHolder(holder: ConversationViewHolder, position: Int) {
        val messageObject = messageList.get(position)

        Glide.with(holder.avatar.context).load(messageObject.avatarURL).into(holder.avatar)

        holder.message.text = messageObject.message
    }
}

class ConversationViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val avatar = view.findViewById<ImageView>(R.id.avatar)
    val message = view.findViewById<TextView>(R.id.message)
}