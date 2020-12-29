package com.devrizkyfransisca.trashureapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val tvGoToLogin = findViewById<TextView>(R.id.tvGoToLogin)
        tvGoToLogin.setOnClickListener {
            val gotologin = Intent(this,LoginAct::class.java)
            startActivity(gotologin)
        }

        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            onBackPressed()
        }
    }
}