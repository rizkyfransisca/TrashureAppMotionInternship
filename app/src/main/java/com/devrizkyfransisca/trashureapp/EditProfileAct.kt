package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class EditProfileAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        initToolbar()
    }
    private fun initToolbar() {
        val toolbarEditAkun = findViewById<Toolbar>(R.id.toolbarEditAkun)

        setSupportActionBar(toolbarEditAkun)
        supportActionBar?.title = "Edit akun"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}