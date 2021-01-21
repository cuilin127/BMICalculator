package com.example.bmiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateBMI = findViewById(R.id.Calculate) as Button
        val weightPounds = findViewById<EditText>(R.id.weightPounds)
        val heightInches = findViewById(R.id.heightInches) as EditText
        val heightFeet = findViewById(R.id.heightFeet) as EditText
        val result = findViewById<TextView>(R.id.BMIResultView)

        calculateBMI.setOnClickListener{
            val a = weightPounds.text.toString().toDouble()
            val b = heightFeet.text.toString().toDouble()
            val c = heightInches.text.toString().toDouble()
            result.text=doIt(a,b,c).toString()
            val d = weightPounds.text


            Log.i("MAIN_ACTIVITY","a= "+ d)
        }
    }
    private fun doIt(a:Double,b:Double,c:Double):Double{

            return a*0.454/((b*12+c)*(b*12+c)*0.0254*0.0254)

    }
}
