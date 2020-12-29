package com.devrizkyfransisca.trashureapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TransaksiAdapter(val list: List<TransaksiModel>) : RecyclerView.Adapter<TransaksiViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransaksiViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_transaksi, parent, false)
        return TransaksiViewHolder(view, parent.context)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: TransaksiViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.onClick(list[position])
    }
}