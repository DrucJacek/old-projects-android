package com.example.myapplicationwfegrmj
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project09.R
import com.example.project09.userlist.User

class UserAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<UserItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_contact, parent, false)

        return UserItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserItemViewHolder, position: Int) {

        val objectData = userList.get(position)

        holder.userName.text = objectData.name
        holder.age.text = objectData.age
        holder.userAvatar.setImageResource(objectData.avatarId)
    }
}
class UserItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val userName = view.findViewById<TextView>(R.id.name)
    val age = view.findViewById<TextView>(R.id.age)
    val userAvatar = view.findViewById<ImageView>(R.id.avatar)
}

interface OnUserClickListener{
    fun onClickListener(user: User)
}