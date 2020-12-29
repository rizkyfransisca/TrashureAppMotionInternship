package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class IsiNotifikasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_notifikasi)

        initToolbar()
    }
    private fun initToolbar() {
        val toolbar2 = findViewById<Toolbar>(R.id.toolbar2)

        setSupportActionBar(toolbar2)
        supportActionBar?.title = "Penukaran Pulsa"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}