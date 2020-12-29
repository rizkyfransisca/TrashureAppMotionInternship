package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PricePulsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price_pulsa)

        val ivBackPricePulsa = findViewById<ImageView>(R.id.ivBackPricePulsa)

        ivBackPricePulsa.setOnClickListener {
            onBackPressed()
        }
    }
}