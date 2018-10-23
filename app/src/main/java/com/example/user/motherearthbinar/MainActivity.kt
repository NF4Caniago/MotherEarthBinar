package com.example.user.motherearthbinar

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_acttivity.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.gempa -> {
                changeFragment(GempaFr())
                return@OnNavigationItemSelectedListener true
            }
            R.id.cuaca -> {
                changeFragment(GempaFr())
                return@OnNavigationItemSelectedListener true
            }
            R.id.berita -> {
                changeFragment(GempaFr())
                return@OnNavigationItemSelectedListener true
            }

            R.id.donasi -> {
                changeFragment(GempaFr())
                return@OnNavigationItemSelectedListener true
            }

            R.id.quake_alert -> {
                changeFragment(GempaFr())
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_acttivity)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit()
    }



}




