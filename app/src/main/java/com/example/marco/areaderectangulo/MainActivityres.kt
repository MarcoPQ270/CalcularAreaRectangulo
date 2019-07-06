package com.example.marco.areaderectangulo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activityres.*

class MainActivityres : AppCompatActivity() {

    companion object ResCompanion {
        val EXTRA_A ="extraA"
        private val DEFAULT_A: Int = -1

        val EXTRA_B ="extraB"
        private val DEFAULT_B: Int = -1

        val EXTRA_C ="extraC"
        private val DEFAULT_C: Int = -1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityres)

        val intent  = intent

        if(intent!=null && intent.hasExtra(MainActivityres.EXTRA_A)) {
            val resA: Int = intent.getIntExtra(MainActivityres.EXTRA_A, MainActivityres.DEFAULT_A)
            val resB: Int = intent.getIntExtra(MainActivityres.EXTRA_B, MainActivityres.DEFAULT_B)
            val resC: Int = intent.getIntExtra(MainActivityres.EXTRA_C, MainActivityres.DEFAULT_C)
            tvh.setText("Altura : " + resA.toString())
            tvb.setText("Base : " + resB.toString())
            tva.setText("Area: : " + resC.toString())

        }

    }
}
