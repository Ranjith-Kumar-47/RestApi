package com.example.restapi1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPosts(val posts: ModelItem) : RecyclerView.Adapter<AdapterPosts.MyViewHolder>() {

    val arrayList: ModelItem = posts

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.posts_layout_design,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 0;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textViewId.text = arrayList.id.toString()
        holder.textViewUserId.text = arrayList.userId.toString()
//        holder.textViewTitle.text = arrayList[position].title
//        holder.textViewBody.text = arrayList[position].body
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewUserId:TextView = itemView.findViewById(R.id.textViewUserId)
        val textViewId:TextView = itemView.findViewById(R.id.textViewId)
        val textViewTitle:TextView = itemView.findViewById(R.id.textViewTitle)
        val textViewBody:TextView = itemView.findViewById(R.id.textViewBody)

    }
}