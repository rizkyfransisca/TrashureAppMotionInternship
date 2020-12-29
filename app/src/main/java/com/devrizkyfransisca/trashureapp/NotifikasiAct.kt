package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class NotifikasiAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)
        initToolbar()

        val tlNotification = findViewById<TabLayout>(R.id.tlNotification)
        val vpNotification = findViewById<ViewPager2>(R.id.vpNotification)
        vpNotification.adapter = NotifikasiPager(this)
        TabLayoutMediator(tlNotification,vpNotification){ tab, position ->
            tab.text = when(position){
                1 -> "Lainnya"
                else -> "Transaksi"
            }
        }.attach()
    }
    private fun initToolbar() {
        val toolbar1 = findViewById<Toolbar>(R.id.toolbar1)

        setSupportActionBar(toolbar1)
        supportActionBar?.title = "Notifikasi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}