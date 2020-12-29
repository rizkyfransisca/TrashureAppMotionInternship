package com.devrizkyfransisca.trashureapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class fifthFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ivToEditAkun = view.findViewById<ImageView>(R.id.ivToEditAkun)
        ivToEditAkun.setOnClickListener {
            val gotoeditakun = Intent (getActivity(), EditProfileAct::class.java)
            getActivity()?.startActivity(gotoeditakun)
        }
    }

}