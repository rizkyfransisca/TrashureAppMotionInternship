package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TransaksiFragment : Fragment() {
    private val lists = arrayListOf<TransaksiModel>()
    lateinit var rvTransaksi: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_transaksi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvTransaksi = view.findViewById<RecyclerView>(R.id.rvTransaksi)
        rvTransaksi.apply {
            adapter = TransaksiAdapter(lists)
            layoutManager = LinearLayoutManager(activity)
        }

        initDummy()
    }

    private fun initDummy() {
        val rvTransaksi = view?.findViewById<RecyclerView>(R.id.rvTransaksi)
        lists.add(
                TransaksiModel(
                        "1","Penukaran Pulsa", "Pulsa sebesar 5000 dengan nomor kartu Tri...", "25 Jun", "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/hp_item.png?alt=media&token=e7829a83-a1d1-4149-8552-b4248c1b7900"
                ))
        lists.add(
                TransaksiModel(
                        "2","Penukaran Pulsa", "Pulsa sebesar 5000 dengan nomor kartu Tri...", "25 Jun", "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/hp_item.png?alt=media&token=e7829a83-a1d1-4149-8552-b4248c1b7900"
                ))
        lists.add(
                TransaksiModel(
                        "3","Penukaran Pulsa", "Pulsa sebesar 5000 dengan nomor kartu Tri...", "25 Jun", "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/hp_item.png?alt=media&token=e7829a83-a1d1-4149-8552-b4248c1b7900"
                ))
        rvTransaksi?.adapter?.notifyDataSetChanged()
    }
}