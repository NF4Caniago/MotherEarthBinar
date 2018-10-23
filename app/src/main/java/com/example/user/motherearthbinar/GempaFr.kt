package com.example.user.motherearthbinar

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.gempa_fr.*


class GempaFr : Fragment() {

    val myadapter = AdapterGempaFr()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v : View
        initRecycleView()
        setData()
        v = inflater.inflate(R.layout.gempa_fr, container, false)
        return v
    }

    private fun initRecycleView(){
        with(gempa_rcv){
            adapter = myadapter
            layoutManager = LinearLayoutManager(activity)
        }

    }

    private fun setData(){
        val data: List<String> = listOf("nama1" ,"nama2" ,"nama3" ,"nama4" ,"nama5", "nama6" , "nama7" , "nama8" , "nama9" , "nama10")
        myadapter.update(data)
    }


}
