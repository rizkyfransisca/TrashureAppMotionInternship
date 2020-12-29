package com.devrizkyfransisca.trashureapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class NotifikasiPager(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> TransaksiFragment()
            1 -> LainnyaFragment()
            else -> TransaksiFragment() // default
        }
    }

}