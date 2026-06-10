package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etSisiKubus = findViewById<EditText>(R.id.etSisiKubus)
        val cbPilihan1 = findViewById<CheckBox>(R.id.cbPilihan1)
        val cbPilihan2 = findViewById<CheckBox>(R.id.cbPilihan2)
        val cbPilihan3 = findViewById<CheckBox>(R.id.cbPilihan3)
        val btnProsesCheckBox = findViewById<Button>(R.id.btnProsesCheckBox)
        val tvHasilCheckBox = findViewById<TextView>(R.id.tvHasilCheckBox)

        btnProsesCheckBox.setOnClickListener {
            val sisi = etSisiKubus.text.toString().toIntOrNull() ?: 0
            var builder = AlertDialog.Builder(this)
            var hasil1 = sisi*sisi
            var hasil2 = 6*sisi*sisi
            var hasil3 = sisi*sisi*sisi

            if (cbPilihan1.isChecked && cbPilihan2.isChecked && cbPilihan3.isChecked) {
                tvHasilCheckBox.text =  "Luas Persegi = $hasil1" + " cm\u00B2\n" +
                                        "Luas Permukaan Kubus = $hasil2" + " cm\u00B2\n" +
                                        "Volume Kubus = $hasil3" + " cm\u00B3\n"
            } else if (cbPilihan1.isChecked && cbPilihan2.isChecked) {
                tvHasilCheckBox.text =  "Luas Persegi = $hasil1" + " cm\u00B2\n" +
                                        "Luas Permukaan Kubus = $hasil2" + " cm\u00B2\n "
            } else if (cbPilihan1.isChecked && cbPilihan3.isChecked) {
                tvHasilCheckBox.text =  "Luas Persegi = $hasil1" + " cm\u00B2\n" +
                                        "Volume Kubus = $hasil3" + " cm\u00B3\n"
            } else if (cbPilihan2.isChecked && cbPilihan3.isChecked) {
                tvHasilCheckBox.text =  "Luas Permukaan Kubus = $hasil2" + " cm\u00B2\n" +
                                        "Volume Kubus = $hasil3" + " cm\u00B3\n"
            } else {
                builder.setTitle("Peringatan")
                builder.setMessage("Silahkan Centang Dua Pilihan")
                builder.setPositiveButton("OK") {
                        dialog, _ ->
                    dialog.dismiss()
                }
                builder.show()
                tvHasilCheckBox.text = "--------"
            }

        }
    }
}