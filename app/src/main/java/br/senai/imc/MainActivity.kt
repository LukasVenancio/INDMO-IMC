package br.senai.imc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

lateinit var pesoEditText: EditText
lateinit var alturaEditText: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)
        val dec = DecimalFormat("##.00")

        calcular.setOnClickListener() {

            pesoEditText = findViewById(R.id.peso)
            alturaEditText = findViewById(R.id.altura)
            val statusContainer = findViewById<TextView>(R.id.statusContainer)
            val mensagemContainer = findViewById<TextView>(R.id.mensagemContainer)

            if (validarCampos()) {
                val peso = pesoEditText.text.toString().toDouble()
                val altura = alturaEditText.text.toString().toDouble()

                val valorIMC = calcularIMC(peso, altura)
                val situacaoIMC = determinarStatusIMC(valorIMC)

                statusContainer.text = "Seu IMC é: " + dec.format(valorIMC)
                mensagemContainer.text = situacaoIMC
            }

        }

        sair.setOnClickListener() {
            finish()
        }

    }


    private fun validarCampos(): Boolean {
        var noError = true

        if (pesoEditText.text.isBlank()){
            pesoEditText.setError("Informe o peso")
            noError = false
        }

        if (alturaEditText.text.isBlank()){
            alturaEditText.setError("Informe a altura")
            noError = false
        }

        return noError

    }

}