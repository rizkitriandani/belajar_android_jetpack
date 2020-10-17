package com.belajar.androidjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textAngka: TextView
    private lateinit var btnTambah: Button
    private lateinit var btnKurang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textAngka = findViewById(R.id.textAngka)
        btnTambah = findViewById(R.id.btnTambah)
        btnKurang = findViewById(R.id.btnKurang)

        var angka = 0
        textAngka.text = angka.toString()

        btnTambah.setOnClickListener{
            angka++
            textAngka.text = angka.toString()
        }

        btnKurang.setOnClickListener{
            angka--
            textAngka.text = angka.toString()
        }

    }
}