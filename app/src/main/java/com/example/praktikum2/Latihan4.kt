package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etjumlahbebek = findViewById<EditText>(R.id.etjumlahbebek)
        val bt_proses_bebek = findViewById<Button>(R.id.bt_proses_bebek)
        val LinearLayoutBebek = findViewById<LinearLayout>(R.id.LinearLayoutBebek)

        bt_proses_bebek.setOnClickListener {
            val input = etjumlahbebek.text.toString().toInt()
            val jumlahbebek = input.coerceIn(1,6)
            LinearLayoutBebek.removeAllViews()
            for (i in 1..jumlahbebek) {
                val imageview = ImageView(this)
                imageview.setImageResource(R.drawable.ic_bebek)

                val prams = LinearLayout.LayoutParams(150,150)
                prams.setMargins(5, 5, 5, 5)
                imageview.layoutParams = prams
                LinearLayoutBebek.addView(imageview)
                }

            }
            }

    }
