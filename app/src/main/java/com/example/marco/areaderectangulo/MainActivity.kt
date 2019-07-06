package com.example.marco.areaderectangulo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a : Int =0
    var b : Int =0
    var res: Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calcula(v:View){
        if(etaltura.text.isEmpty()|| etbase.text.isEmpty()){
            Toast.makeText(this,"Existen cajas vacias",Toast.LENGTH_SHORT).show()
        }else
        {
            a = etaltura.text.toString().toInt()
            b= etbase.text.toString().toInt()
            res=b*a

            val intent = Intent(this, MainActivityres::class.java)
            intent.putExtra(MainActivityres.EXTRA_A,a)
            intent.putExtra(MainActivityres.EXTRA_B,b)
            intent.putExtra(MainActivityres.EXTRA_C,res)
            startActivity(intent)
        }
    }
}
