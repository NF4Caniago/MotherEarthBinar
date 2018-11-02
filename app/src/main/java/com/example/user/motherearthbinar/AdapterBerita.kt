package com.example.user.motherearthbinar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AdapterBerita : RecyclerView.Adapter<AdapterBerita.cardView1>() {

    var data = arrayListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardView1 {
        return cardView1(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_berita1, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: cardView1, position: Int) {

    }

    inner class cardView1(view: View) : RecyclerView.ViewHolder(view) {

    }
}
