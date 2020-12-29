package com.devrizkyfransisca.trashureapp

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText


class SecondFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cobasecond = view.findViewById<LinearLayout>(R.id.cobasecond)
        val arrowToggle = view.findViewById<ImageView>(R.id.arrowToggle)
        val viewsecond = view.findViewById<View>(R.id.viewsecond)
        val etNominal = view.findViewById<TextInputEditText>(R.id.etNominal)
        val btTukar = view.findViewById<Button>(R.id.btTukar)

        btTukar.setOnClickListener {
            val intent = Intent(activity, KonfirmasiPenukaranAct::class.java)
            startActivity(intent)
        }

        etNominal.setOnClickListener {
            val intent = Intent(activity, PricePulsa::class.java)
            startActivity(intent)
        }

        var check = true
        cobasecond.visibility = View.GONE
        viewsecond.visibility = View.GONE
        arrowToggle.setOnClickListener {
            if(check == true){
                cobasecond.animate()
                        .alpha(1.0f)
                        .setDuration(200)
                        .setListener(object : AnimatorListenerAdapter() {
                            override fun onAnimationEnd(animation: Animator?) {
                                super.onAnimationEnd(animation)
                                cobasecond.visibility = View.VISIBLE
                                viewsecond.visibility = View.VISIBLE
                            }
                        })

                arrowToggle.animate().rotation(180F)
                check = false
            }else{
                cobasecond.animate()
                        .alpha(0.0f)
                        .setDuration(200)
                        .setListener(object : AnimatorListenerAdapter() {
                            override fun onAnimationEnd(animation: Animator?) {
                                super.onAnimationEnd(animation)
                                cobasecond.visibility = View.GONE
                                viewsecond.visibility = View.GONE
                            }
                        })

                check = true
                arrowToggle.animate().rotation(0F)
            }
        }

    }
}