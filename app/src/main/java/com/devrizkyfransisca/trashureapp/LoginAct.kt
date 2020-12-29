package com.devrizkyfransisca.trashureapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvGoToRegister = findViewById<TextView>(R.id.tvGoToRegister)
        val btnLoginBtn = findViewById<Button>(R.id.btnLoginBtn)

        tvGoToRegister.setOnClickListener {
            val gotoregister = Intent(this,RegisterAct::class.java)
            startActivity(gotoregister)
        }

        btnLoginBtn.setOnClickListener {
            val gotohomepage = Intent(this,HomeAct::class.java)
            startActivity(gotohomepage)
            finish()
        }

    }
}