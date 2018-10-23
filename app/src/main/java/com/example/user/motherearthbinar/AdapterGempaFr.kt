package com.example.user.motherearthbinar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.view_holder_gempa_fr.view.*

class AdapterGempaFr : RecyclerView.Adapter<AdapterGempaFr.cardView1>() {

    var data: List<String> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGempaFr.cardView1 {
        return cardView1(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_gempa_fr, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AdapterGempaFr.cardView1, position: Int) {
        holder.textData.text = data[position]
    }


   inner class cardView1(view: View): RecyclerView.ViewHolder(view){
        val textData : TextView =  view.tempat_gempa
    }

  fun update(x: List<String>){
        this.data = x
        notifyDataSetChanged()
    }
}
