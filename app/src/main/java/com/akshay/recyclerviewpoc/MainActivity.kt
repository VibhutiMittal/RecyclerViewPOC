package com.akshay.recyclerviewpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var adapter: MainAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MainAdapter(getList())
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val recyclerView = findViewById<RecyclerView>(R.id.rvMain)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }

    private fun getList(): ArrayList<MainItem> {
        return ArrayList<MainItem>().apply {
            add(MainItem("Test", "Test description"))
            add(MainItem("Test1", "Test description"))
            add(MainItem("Test2", "Test description"))
            add(MainItem("Test3", "Test description"))
            add(MainItem("Test4", "Test description"))
            add(MainItem("Test5", "Test description"))
            add(MainItem("Test6", "Test description"))
        }
    }
}