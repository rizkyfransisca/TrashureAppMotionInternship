package com.devrizkyfransisca.trashureapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class KonfirmasiPenukaranAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_penukaran)

        initToolbar()
    }
    private fun initToolbar() {
        val toolbarKonfirmasi = findViewById<Toolbar>(R.id.toolbarKonfirmasi)
        val btTukarPenukaran = findViewById<Button>(R.id.btTukarPenukaran)

        btTukarPenukaran.setOnClickListener {
            val gotosuccesreedem = Intent(this,SuccessRedeemAct::class.java)
            startActivity(gotosuccesreedem)
        }

        setSupportActionBar(toolbarKonfirmasi)
        supportActionBar?.title = "Konfirmasi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}