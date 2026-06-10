package com.example.praktikum2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btProsesLat2 = findViewById<Button>(R.id.btProsesLat2)
        val rgKategori = findViewById<RadioGroup>(R.id.rgKategori)
        val rbOpsi1 = findViewById<RadioButton>(R.id.rbOpsi1)
        val rbOpsi2 = findViewById<RadioButton>(R.id.rbOpsi2)
        val rbOpsi3 = findViewById<RadioButton>(R.id.rbOpsi3)

        btProsesLat2.setOnClickListener {
            val selectedOption = rgKategori.checkedRadioButtonId
            if (selectedOption == rbOpsi1.id) {
                btProsesLat2.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
            }
            else if (selectedOption == rbOpsi2.id) {
                btProsesLat2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            }
            else if (selectedOption == rbOpsi3.id) {
                btProsesLat2.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
            }
            else {
                btProsesLat2.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
            }
            }
        }
    }
