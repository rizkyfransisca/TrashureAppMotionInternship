package com.devrizkyfransisca.trashureapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LainnyaAdapter(val list: List<LainnyaModel>) : RecyclerView.Adapter<LainnyaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LainnyaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lainnya, parent, false)
        return LainnyaViewHolder(view, parent.context)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LainnyaViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.onClick(list[position])
    }
}