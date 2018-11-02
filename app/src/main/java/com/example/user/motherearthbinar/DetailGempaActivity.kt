package com.example.user.motherearthbinar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailGempaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gempa)
        var dataModel = intent.getParcelableExtra<GempaModel>("data")

        var tv_lokasi = findViewById<TextView>(R.id.tv_lokasi)
        var tv_status = findViewById<TextView>(R.id.tv_status)

        tv_lokasi.text = dataModel.lokasi
        tv_status.text = dataModel.status

    }
}
