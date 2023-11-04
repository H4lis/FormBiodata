package com.example.laporan2_biodata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val edNama = findViewById<EditText>(R.id.edName)
        val edNim = findViewById<EditText>(R.id.edNim)
        val edJurusan = findViewById<EditText>(R.id.edJurusan)
        val edAsal = findViewById<EditText>(R.id.edAsal)

        btnSubmit.setOnClickListener{
            val nama = edNama.text.toString()
            val nim = edNim.text.toString().toInt()
            val jurusan = edJurusan.text.toString()
            val asal = edAsal.text.toString()


            Intent(this, BiodataActivity::class.java).also {
                it.putExtra("EXTRA_NAMA", nama)
                it.putExtra("EXTRA_NIM", nim)
                it.putExtra("EXTRA_JURUSAN", jurusan)
                it.putExtra("EXTRA_ASAL", asal)

                startActivity(it)

            }

        }




    }
}