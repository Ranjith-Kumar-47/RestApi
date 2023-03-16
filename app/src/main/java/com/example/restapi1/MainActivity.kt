package com.example.restapi1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    lateinit var buttonPosts: Button
    lateinit var buttonComments: Button

    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPosts = findViewById(R.id.buttonPosts)
        buttonComments = findViewById(R.id.buttonComments)
        val posts = GetRepository(this).getPosts()

//        Toast.makeText(applicationContext,posts.toString(),Toast.LENGTH_SHORT).show()
//        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        val adapterPosts = AdapterPosts(posts)
//        recyclerView.adapter = adapterPosts

    }


}