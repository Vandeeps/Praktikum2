package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

import androidx.core.content.ContextCompat
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val spinner = findViewById<Spinner>(R.id.spinner)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val pilihan = spinner.selectedItem.toString()
            when (pilihan) {
                "Merah" ->
                    button.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                "Biru" ->
                    button.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
                "Hijau" ->
                    button.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                else -> {
                    val builder = android.app.AlertDialog.Builder(this)
                    builder
                        .setTitle("Peringatan")
                        .setMessage("Warna Akan Di reset ke awal, apakah anda yakin?!")
                        .setPositiveButton("OK") {
                            dialog, which ->
                            dialog.dismiss()
                            button.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500))
                        }
                        .setNegativeButton("Batal") {
                            dialog, which ->
                            dialog.dismiss()
                        }
                    .show()
                }

            }
        }
            }

    }
