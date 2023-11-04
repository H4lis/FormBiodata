package com.example.laporan2_biodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val tvHasil = findViewById<TextView>(R.id.tv_hasil)
        val tvNim = findViewById<TextView>(R.id.tv_nimm)
        val tvJurusan = findViewById<TextView>(R.id.tv_jurusan)
        val tvasal = findViewById<TextView>(R.id.tv_asal)

        val name = intent.getStringExtra("EXTRA_NAMA")
        val nim = intent.getIntExtra("EXTRA_NIM",0)
        val jurusan = intent.getStringExtra("EXTRA_JURUSAN")
        val asal = intent.getStringExtra("EXTRA_ASAL")

        val tvNamaData =    "$name"
        val tvNimData =     "Nim     : $nim"
        val tvJurusanData = "Jurusan : $jurusan"
        val tvAsalData =    "Asal    : $asal"

        tvHasil.text = tvNamaData
        tvNim.text = tvNimData
        tvJurusan.text = tvJurusanData
        tvasal.text = tvAsalData





    }
}