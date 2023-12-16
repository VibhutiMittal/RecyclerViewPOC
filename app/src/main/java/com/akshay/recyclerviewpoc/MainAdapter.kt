package com.akshay.recyclerviewpoc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val list: ArrayList<MainItem>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun init() {
            val title: AppCompatTextView = view.findViewById(R.id.tvTitle)
            val description: AppCompatTextView = view.findViewById(R.id.tvDescription)

            title.text = list[adapterPosition].title
            description.text = list[adapterPosition].description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_main_item, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.init()
    }
}