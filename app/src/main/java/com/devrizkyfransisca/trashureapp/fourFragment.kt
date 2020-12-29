package com.devrizkyfransisca.trashureapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class fourFragment : Fragment() {

    private val lists = arrayListOf<HargaModel>()
    lateinit var rvTransaksi: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvHarga = view.findViewById<RecyclerView>(R.id.rvHarga)
        rvHarga.apply {
            adapter = HargaAdapter(lists)
            layoutManager = LinearLayoutManager(activity)
        }

        initDummy()
    }

    private fun initDummy() {
        val rvHarga = view?.findViewById<RecyclerView>(R.id.rvHarga)
        lists.add(
                HargaModel(
                        "1","Sampah plastik", "Rp.3500/kg",  "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/gambar_botol.jpg?alt=media&token=011c21c7-5b04-47d4-9098-ce104d2ab952"
                ))
        lists.add(
                HargaModel(
                        "2","Sampah kaleng", "Rp.5000/kg",  "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/gambar_kaleng.jpg?alt=media&token=c6ea1f35-69d8-428f-8576-569faa7fafce"
                ))
        lists.add(
                HargaModel(
                        "3","Sampah kardus", "Rp.4000/kg",  "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/gambar_kardus.jpg?alt=media&token=54cc3ead-0b77-415f-8b49-cf9e71b6e94c"
                ))
        lists.add(
                HargaModel(
                        "4","Sampah kardus", "Rp.4000/kg",  "https://firebasestorage.googleapis.com/v0/b/todolistapp-4aa24.appspot.com/o/gambar_kardus.jpg?alt=media&token=54cc3ead-0b77-415f-8b49-cf9e71b6e94c"
                ))
        rvHarga?.adapter?.notifyDataSetChanged()
    }
}