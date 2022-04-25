package com.example.myktapplication.activity

import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.myktapplication.R
import com.example.myktapplication.adapter.GridAdapter
import com.example.myktapplication.adapter.MemberAdapter
import com.example.myktapplication.model.Member

var gridview: GridView? = null

class GridActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        initViews()
    }

    fun initViews(){
        gridview = findViewById(R.id.gridview)

        val members = ArrayList<Member>()
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"))
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Begzodbek"))
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Xurshidbek"))
        members.add(Member(R.drawable.ic_icons8_twitter_480, "Begzodbek"))

        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>){
        var adapter = GridAdapter(this, members)
        gridview?.adapter = adapter

    }
}