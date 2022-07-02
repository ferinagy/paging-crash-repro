package com.example.pagingcrashrepro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TEST", "onCreate: creating adapter")
        val adapter = object : PagingDataAdapter<String, RecyclerView.ViewHolder>(object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String) = true
            override fun areContentsTheSame(oldItem: String, newItem: String) = true

        }) {
            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = TODO()
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = TODO()
        }
        Log.d("TEST", "onCreate: created adapter $adapter")
    }
}