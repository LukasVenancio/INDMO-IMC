package br.senai.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val pesoTextView = findViewById<TextView>(R.id.peso)
        val alturaTextView = findViewById<TextView>(R.id.altura)
        val imcTextView = findViewById<TextView>(R.id.imc)
        val statusTextView = findViewById<TextView>(R.id.status)

        val intent : Intent = getIntent()

        val actionBar = supportActionBar
        actionBar!!.setDefaultDisplayHomeAsUpEnabled(true)

        pesoTextView.text = intent.getStringExtra("peso")
        alturaTextView.text = intent.getStringExtra("altura")
        imcTextView.text = intent.getStringExtra("imc")
        statusTextView.text = intent.getStringExtra("status")

    }
}