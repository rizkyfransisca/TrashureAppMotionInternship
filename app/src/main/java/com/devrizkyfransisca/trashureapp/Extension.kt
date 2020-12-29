package com.devrizkyfransisca.trashureapp

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.load(url : String){
    Picasso.get()
            .load(url)
            .fit()
            .into(this)
}