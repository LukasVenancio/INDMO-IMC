package br.senai.imc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener(){
            val peso = findViewById<EditText>(R.id.peso).text.toString().toDouble()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val statusContainer = findViewById<TextView>(R.id.statusContainer)
            val mensagemContainer = findViewById<TextView>(R.id.mensagemContainer)
            val mensagemSecundaria = findViewById<TextView>(R.id.mensagemSecundaria)
            val valorStatus = peso / (altura * altura)

            if (valorStatus < 18.5){
                statusContainer.text = "Seu IMC é: " + valorStatus
                mensagemContainer.text = "Vocé está abaixo do peso!"

            }else if (valorStatus < 25){
                statusContainer.text = "Seu IMC é: " + valorStatus
                mensagemContainer.text = "Vocé está com o peso ideal!"
                mensagemSecundaria.text = "Parabéns!"
                mensagemSecundaria.setTextColor(Color.GREEN)

            }else if (valorStatus < 30){
                statusContainer.text = "Seu IMC é: " + valorStatus
                mensagemContainer.text = "Vocé está levemente acima do peso!"

            }else if (valorStatus < 35){
                statusContainer.text = "Seu IMC é: " + valorStatus
                mensagemContainer.text = "Vocé está com obesidade grau I!"

            }else if (valorStatus < 40){
                statusContainer.text = "Seu IMC é: " + valorStatus
                mensagemContainer.text = "Vocé está com obesidade grau II!"

            }else{
                statusContainer.text = "Seu IMC é: " + valorStatus
                mensagemContainer.text = "Vocé está com obesidade grau III!"
                mensagemSecundaria.text = "Cuidado!"
                mensagemSecundaria.setTextColor(Color.RED)
            }
        }

        sair.setOnClickListener(){
            finish()
        }

    }
}