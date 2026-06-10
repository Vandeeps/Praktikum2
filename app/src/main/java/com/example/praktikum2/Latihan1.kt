package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.graphics.Color
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btProsesLat1 = findViewById<Button>(R.id.btProsesLat1)
        val etNamaLat1 = findViewById<EditText>(R.id.etNamaLat1)

        btProsesLat1.setOnClickListener {
            val nama = etNamaLat1.text.toString()
            if (nama == "teal") {
                btProsesLat1.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700))
            }
            else if (nama == "purple") {
                btProsesLat1.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500))
            }
            else if (nama == "pink") {
                btProsesLat1.setBackgroundColor(Color.parseColor("#FFC0CB"))
            }
            else {
                btProsesLat1.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
            }
        }
    }
}