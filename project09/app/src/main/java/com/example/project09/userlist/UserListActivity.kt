package com.example.project09.userlist

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project09.R
import com.example.project09.databinding.ActivityUsersListBinding
import com.example.project09.userlist.User
import com.example.project09.userlist.UserAdapter

class UserListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityUsersListBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val context = this

        with(binding){
            userrecyclerview.adapter = UserAdapter(userlist, object : OnUserClickListener{
                override fun onClickListener(user: User) {
                    println(user.name)
                    val conversationDetailsIntent = Intent(context, ConversationsDetailsActivity::class.java)
                    startActivity(conversationDetailsIntent)
                }
            })
            userrecyclerview.layoutManager = LinearLayoutManager(context)
        }
    }


    val userlist = arrayListOf<User>(
        User("Kamil", R.drawable.img, "Siema co tam"),
        User("Tomasz Hajto", R.drawable.img_1, "Rozjechałem kogoś :0"),
        User("Lil peep", R.drawable.img_1, "broken forever"),
        User("Elvis P", R.drawable.img, "they killed me, trust me"),
        User("Kamil", R.drawable.img, "Siema co tam"),
        User("Tomasz Hajto", R.drawable.img, "Rozjechałem kogoś :0"),
        User("Lil peep", R.drawable.img_1, "broken forever"),
        User("Elvis P", R.drawable.img, "they killed me, trust me"),
        User("Kamil", R.drawable.img, "Siema co tam"),
        User("Tomasz Hajto", R.drawable.img, "Rozjechałem kogoś :0"),
        User("Lil peep", R.drawable.img_1, "broken forever"),
        User("Elvis P", R.drawable.img, "they killed me, trust me"),
        User("Kamil", R.drawable.img, "Siema co tam"),
        User("Tomasz Hajto", R.drawable.img_1, "Rozjechałem kogoś :0"),
        User("Lil peep", R.drawable.img, "broken forever"),
        User("Elvis P", R.drawable.img, "they killed me, trust me"),
        User("Kamil", R.drawable.img_1, "Siema co tam"),
        User("Tomasz Hajto", R.drawable.img, "Rozjechałem kogoś :0"),
        User("Lil peep", R.drawable.img_1, "broken forever"),
        User("Elvis P", R.drawable.img, "they killed me, trust me"),

        )
}