package com.example.myapplicationpractica02dsm104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var operando1: EditText
    lateinit var operando2: EditText
    lateinit var enviar: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operando1 = findViewById(R.id.TxtOperando1)
        operando2 = findViewById(R.id.TxtOperando2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LlbResultado)

        enviar.setOnClickListener {
            val operando1Value = operando1.text.toString().toFloatOrNull() ?: 0f
            val operando2Value = operando2.text.toString().toFloatOrNull() ?: 0f
            val suma = operando1Value + operando2Value
            resultado.text = getString(R.string.resultado, suma)
        }
    }
}
