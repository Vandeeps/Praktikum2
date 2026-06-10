package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tugas1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tugas1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bt_on = findViewById<Button>(R.id.bt_on)
        val rbPilihan1 = findViewById<RadioButton>(R.id.rbPilihan1)
        val rbPilihan2 = findViewById<RadioButton>(R.id.rbPilihan2)
        val rbPilihan3 = findViewById<RadioButton>(R.id.rbPilihan3)
        val ic_lamp = findViewById<ImageView>(R.id.imageView2)

        bt_on.setOnClickListener {
            ic_lamp.setImageResource(R.drawable.ic_lamp_on)
            if (rbPilihan1.isChecked) {
                ic_lamp.setImageResource(R.drawable.ic_lamp_light_on_white)
                bt_on.text = "TURN OFF"
            } else if (rbPilihan2.isChecked) {
                ic_lamp.setImageResource(R.drawable.ic_lamp_light_on_yellow)
                bt_on.text = "TURN OFF"
            } else if (rbPilihan3.isChecked) {
                ic_lamp.setImageResource(R.drawable.ic_lamp_light_on_blue)
                bt_on.text = "TURN OFF"
            } else if(bt_on.setOnClickListener) {
                ic_lamp.setImageResource(R.drawable.ic_lamp)
                bt_on.text = "TURN ON"
            }
        }
    }
}