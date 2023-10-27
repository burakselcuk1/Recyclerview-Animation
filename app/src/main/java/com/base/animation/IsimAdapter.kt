package com.base.animation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IsimAdapter(private val isimList: List<IsimModel>) : RecyclerView.Adapter<IsimAdapter.IsimViewHolder>() {

    inner class IsimViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val isimTextView: TextView = itemView.findViewById(R.id.isimTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IsimViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_isim, parent, false)
        return IsimViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: IsimViewHolder, position: Int) {
        val currentItem = isimList[position]
        holder.isimTextView.text = currentItem.isim
    }

    override fun getItemCount() = isimList.size
}
