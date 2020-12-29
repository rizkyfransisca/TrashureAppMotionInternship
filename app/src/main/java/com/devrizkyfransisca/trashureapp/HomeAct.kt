package com.devrizkyfransisca.trashureapp

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeAct : AppCompatActivity() {
    lateinit var menuItem : MenuItem
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val navController = findNavController(R.id.fragment)
//
//        bottomNavigationView.setupWithNavController(navController)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)


        val vpMain = findViewById<ViewPager2>(R.id.vpMain)
        vpMain.adapter = HomePagerAdapter(this)

        val ivNotifikasi = findViewById<ImageView>(R.id.ivNotifikasi)
        ivNotifikasi.setOnClickListener {
            val gotonotifikasi = Intent(this,NotifikasiAct::class.java)
            startActivity(gotonotifikasi)
        }

        val ivSetting = findViewById<ImageView>(R.id.ivSetting)
        ivSetting.setOnClickListener {
            val gotopengaturan = Intent(this,PengaturanAct::class.java)
            startActivity(gotopengaturan)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.firstFragment -> {
                    vpMain.currentItem = 0
                    toolbar?.title = "Trashure"
                    ivNotifikasi.setImageDrawable(
                            ContextCompat.getDrawable(
                                    applicationContext, // Context
                                    R.drawable.ic_lonceng // Drawable
                            )
                    )
                    ivSetting.setImageDrawable(
                            ContextCompat.getDrawable(
                                    applicationContext, // Context
                                    R.drawable.ic_setting // Drawable
                            )
                    )
                }
                R.id.secondFragment -> {
                    vpMain.currentItem = 1
                    toolbar?.title = "Penukaran"
                    ivNotifikasi.setImageDrawable(null)
                    ivSetting.setImageDrawable(null)
                }
                R.id.thirdFragment -> {
                    vpMain.currentItem = 2
                    toolbar?.title = "Scan"
                    ivNotifikasi.setImageDrawable(null)
                    ivSetting.setImageDrawable(null)
                }
                R.id.fourFragment -> {
                    vpMain.currentItem = 3
                    toolbar?.title = "Harga sampah"
                    ivNotifikasi.setImageDrawable(null)
                    ivSetting.setImageDrawable(null)
                }
                R.id.fifthFragment -> {
                    vpMain.currentItem = 4
                    toolbar?.title = "Akun"
                    ivNotifikasi.setImageDrawable(null)
                    ivSetting.setImageDrawable(null)
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
        vpMain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                bottomNavigationView.menu.getItem(position).isChecked = true
                menuItem = bottomNavigationView.menu.getItem(position)
                when(position){
                    0 -> {
                        toolbar?.title = "Trashure"
                        ivNotifikasi.setImageDrawable(
                                ContextCompat.getDrawable(
                                        applicationContext, // Context
                                        R.drawable.ic_lonceng // Drawable
                                )
                        )
                        ivSetting.setImageDrawable(
                                ContextCompat.getDrawable(
                                        applicationContext, // Context
                                        R.drawable.ic_setting // Drawable
                                )
                        )
                    }
                    1 -> {
                        toolbar?.title = "Penukaran"
                        ivNotifikasi.setImageDrawable(null)
                        ivSetting.setImageDrawable(null)
                    }
                    2 -> {
                        toolbar?.title = "Scan"
                        ivNotifikasi.setImageDrawable(null)
                        ivSetting.setImageDrawable(null)
                    }
                    3 -> {
                        toolbar?.title = "Harga sampah"
                        ivNotifikasi.setImageDrawable(null)
                        ivSetting.setImageDrawable(null)
                    }
                    4 -> {
                        toolbar?.title = "Akun"
                        ivNotifikasi.setImageDrawable(null)
                        ivSetting.setImageDrawable(null)
                    }
                }

            }
        })
    }
}