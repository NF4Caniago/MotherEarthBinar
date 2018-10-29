package com.example.user.motherearthbinar

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.gempa_fr.*


class GempaFragment : Fragment() {

    lateinit var myadapter: AdapterGempaFr

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.gempa_fr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        context?.let {
            myadapter = AdapterGempaFr(it)
        }

        initRecycleView()
        setData()
    }

    private fun initRecycleView() {
        with(gempa_rcv) {
            adapter = myadapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

    private fun setData() {
        // data dummy test warna list gempa
        var dataGempa = mutableListOf<GempaModel>()
        val lokasiku: List<String> = listOf(
            "Sulawesi , Indonesia",
            "Lampung , Indonesia",
            "Yogyakarta , Indonesia",
            "Yogyakarta , Indonesia",
            "Padang , Indonesia"
        );

        var dummyStatus = mutableListOf<String>(
            "waspada",
            "aman",
            "aman",
            "bahaya",
            "waspada"
        )

        var myGempa : ArrayList<GempaModel> = arrayListOf()


//        var dummy1 = GempaModel().apply {
//            lokasi = lokasiku[0]
//            status = dummyStatus[0]
//        }
//
//        var dummy2 = GempaModel().apply {
//            lokasi = lokasiku[1]
//            status = dummyStatus[1]
//        }
//        var dummy3 = GempaModel().apply {
//            lokasi = lokasiku[2]
//            status = dummyStatus[2]
//        }
//        var dummy4 = GempaModel().apply {
//            lokasi = lokasiku[3]
//            status = dummyStatus[3]
//        }
//        var dummy5 = GempaModel().apply {
//            lokasi = lokasiku[4]
//            status = dummyStatus[4]
//        }

        for (i in lokasiku.indices) {
            var dummy = GempaModel().apply {
                lokasi = lokasiku[i]
                status = dummyStatus[i]
            }
            myGempa.add(i,dummy)
        }
//        dataGempa = mutableListOf(dummy1,dummy2,dummy3,dummy4,dummy5)

        myadapter.update(myGempa)


    }
}
