package com.example.user.motherearthbinar

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.gempa_fr.*


class GempaFr : Fragment() {

    val myadapter = AdapterGempaFr()

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.gempa_fr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycleView()
        setData()
    }

    private fun initRecycleView(){
        with(gempa_rcv){
            adapter = myadapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

    private fun setData(){
        val data: List<String> = listOf("tempat1" ,"tempat2" ,"tempat3" ,"tempat4" ,"tempat5", "tempat6" , "tempat7" , "tempat8" , "tempat9" , "tempat10")
        myadapter.update(data)
    }


}
