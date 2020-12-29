package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LainnyaFragment : Fragment() {

    private val lists = arrayListOf<LainnyaModel>()
    lateinit var rvLainnya: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lainnya, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvLainnya = view.findViewById<RecyclerView>(R.id.rvLainnya)
        rvLainnya.apply {
            adapter = LainnyaAdapter(lists)
            layoutManager = LinearLayoutManager(activity)
        }

        initDummy()
    }

    private fun initDummy() {
        val rvLainnya = view?.findViewById<RecyclerView>(R.id.rvLainnya)
        lists.add(
                LainnyaModel(
                        "1","Update Trashure v1.3", "Update App Trashure v1.3 kali ini merupakan ...", "25 Jun", "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/daun_item.png?alt=media&token=5d0b0169-b4a1-4686-956d-4d1bf3b4d4bd"
                ))
        lists.add(
                LainnyaModel(
                        "2","Update Trashure v1.3", "Update App Trashure v1.3 kali ini merupakan ...", "20.50", "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/daun_item.png?alt=media&token=5d0b0169-b4a1-4686-956d-4d1bf3b4d4bd"
                ))
        lists.add(
                LainnyaModel(
                        "3","Update Trashure v1.3", "Update App Trashure v1.3 kali ini merupakan ...", "20.50", "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/daun_item.png?alt=media&token=5d0b0169-b4a1-4686-956d-4d1bf3b4d4bd"
                ))
        rvLainnya?.adapter?.notifyDataSetChanged()
    }
}