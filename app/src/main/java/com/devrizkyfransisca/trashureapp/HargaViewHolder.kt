package com.devrizkyfransisca.trashureapp

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HargaViewHolder(val view : View, val context: Context) : RecyclerView.ViewHolder(view) {
    private var tvTitleHargaSampah : TextView? = null
    private var tvHarga : TextView? = null
    private var ivGambarHarga : ImageView
    init {
        tvTitleHargaSampah = view.findViewById(R.id.tvTitleHargaSampah)
        tvHarga = view.findViewById(R.id.tvHarga)
        ivGambarHarga = view.findViewById(R.id.ivGambarHarga)
    }
    fun onBind(child: HargaModel) {
        tvTitleHargaSampah?.text = child.title
        tvHarga?.text = child.harga
        ivGambarHarga.load(child.images)
    }

    fun onClick(child: HargaModel) {
        view.setOnClickListener {
        }
    }
}