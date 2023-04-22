package com.example.ejercicio5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ejercicio #5 Crear un programa que imprima los numero del 1 al 100
        numeros()
    }

    private fun numeros() {

        for (x in 1..100)
            println(x)

    }
}