package com.devrizkyfransisca.trashureapp

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TransaksiViewHolder(val view : View, val context: Context) : RecyclerView.ViewHolder(view) {
    private var tvTransaksiTitle : TextView? = null
    private var tvTransaksiSubTitle : TextView? = null
    private var tvTransaksiDate : TextView? = null
    private var ivTransaksiHp : ImageView
    init {
        tvTransaksiTitle = view.findViewById(R.id.tvTransaksiTitle)
        tvTransaksiSubTitle = view.findViewById(R.id.tvTransaksiSubTitle)
        tvTransaksiDate = view.findViewById(R.id.tvTransaksiDate)
        ivTransaksiHp = view.findViewById(R.id.ivTransaksiHp)
    }
    fun onBind(child: TransaksiModel) {
        tvTransaksiTitle?.text = child.title
        tvTransaksiSubTitle?.text = child.subtitle
        tvTransaksiDate?.text = child.date
        ivTransaksiHp.load(child.images)
    }

    fun onClick(child: TransaksiModel) {
        view.setOnClickListener {
            val intent = Intent(context, IsiNotifikasi::class.java)
            context.startActivity(intent)
        }
    }
}