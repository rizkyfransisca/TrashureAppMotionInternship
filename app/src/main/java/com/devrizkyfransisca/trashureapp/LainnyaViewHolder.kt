package com.devrizkyfransisca.trashureapp

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LainnyaViewHolder(val view : View, val context: Context) : RecyclerView.ViewHolder(view) {
    private var tvLainnyaTitle : TextView? = null
    private var tvLainnyaSubTitle : TextView? = null
    private var tvLainnyaDate : TextView? = null
    private var ivLainnya : ImageView
    init {
        tvLainnyaTitle = view.findViewById(R.id.tvLainnyaTitle)
        tvLainnyaSubTitle = view.findViewById(R.id.tvLainnyaSubTitle)
        tvLainnyaDate = view.findViewById(R.id.tvLainnyaDate)
        ivLainnya = view.findViewById(R.id.ivLainnya)
    }
    fun onBind(child: LainnyaModel) {
        tvLainnyaTitle?.text = child.title
        tvLainnyaSubTitle?.text = child.subtitle
        tvLainnyaDate?.text = child.date
        ivLainnya.load(child.images)
    }

    fun onClick(child: LainnyaModel) {
        view.setOnClickListener {
        }
    }
}