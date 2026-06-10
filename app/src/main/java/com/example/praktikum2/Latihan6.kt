package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            val et_nim = findViewById<EditText>(R.id.et_nim)
            val et_nama = findViewById<EditText>(R.id.et_nama)
            val et_kelas = findViewById<EditText>(R.id.et_kelas)
            val bt_hasil = findViewById<Button>(R.id.bt_hasil)
            val et_hasil = findViewById<TextView>(R.id.et_hasil)
            bt_hasil.setOnClickListener {
                val nim = et_nim.text.toString()
                val nama = et_nama.text.toString()
                val kelas = et_kelas.text.toString()
                et_hasil.setText("Halo, $nim $nama di $kelas")
            }

        }
    }