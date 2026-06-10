package com.example.praktikum2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val btnLatihan1 = findViewById<Button>(R.id.btnMenuLatihan1)
        val btnLatihan2 = findViewById<Button>(R.id.btnMenuLatihan2)
        val btnLatihan3 = findViewById<Button>(R.id.btnMenuLatihan3)
        val btnLatihan4 = findViewById<Button>(R.id.btnMenuLatihan4)
        val btnLatihan5 = findViewById<Button>(R.id.btnMenuLatihan5)


        btnLatihan1.setOnClickListener {
            val intent = Intent(this, Latihan1::class.java)
            startActivity(intent)
        }

        btnLatihan2.setOnClickListener {
            val intent = Intent(this, Latihan2::class.java)
            startActivity(intent)
        }
        btnLatihan3.setOnClickListener {
            val intent = Intent(this, Latihan3::class.java)
            startActivity(intent)
        }
        btnLatihan4.setOnClickListener {
            val intent = Intent(this, Latihan4::class.java)
            startActivity(intent)
        }
        btnLatihan5.setOnClickListener {
            val intent = Intent(this, Latihan5::class.java)
            startActivity(intent)
        }
    }
}
