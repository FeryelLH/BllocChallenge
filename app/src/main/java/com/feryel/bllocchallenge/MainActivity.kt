package com.feryel.bllocchallenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val notificationListener = NotificationListener()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myViewModel = ViewModelProvider(this).get(NotificationViewModel::class.java)
        val recyclerView = findViewById<RecyclerView>(R.id.notifRecyclerView)
        myViewModel.getNotifs().observe(
            this,
            Observer { notifs ->
                recyclerView.adapter = NotificationAdapter(notifs.toTypedArray())
            }
        )

    }
}
