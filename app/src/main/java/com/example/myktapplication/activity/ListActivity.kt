package com.example.myktapplication.activity

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.myktapplication.R
import com.example.myktapplication.adapter.MemberAdapter
import com.example.myktapplication.model.Member

var listView: ListView? = null

class ListActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        initViews()
    }

    fun initViews(){
        listView = findViewById(R.id.listView)

        val members = ArrayList<Member>()
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"))
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Begzodbek"))
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"))
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Begzodbek"))

        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>){
        var adapter = MemberAdapter(this, members)
        listView?.adapter = adapter

    }
}