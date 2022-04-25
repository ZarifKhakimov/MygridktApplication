package com.example.myktapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myktapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVews()
    }

    fun initVews(){
        var b = findViewById<Button>(R.id.b_push)
        b.setOnClickListener({
            openListActivity()
        })
    }

    fun openListActivity(){
        val intent = Intent(this, GridActivity::class.java)
        startActivity(intent)
    }
}