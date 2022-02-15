package br.senai.imc

fun determinarStatusIMC (imc: Double): String{

    var status: String

    if (imc < 18.5){
        status = "Vocé está abaixo do peso!"
    }else if (imc < 25){
        status = "Vocé está com o peso ideal!"
    }else if (imc < 30){
        status = "Vocé está levemente acima do peso!"
    }else if (imc < 35){
        status = "Vocé está com obesidade grau I!"
    }else if (imc < 40){
        status = "Vocé está com obesidade grau II!"
    }else{
        status = "Você está com obesidade grau III!"
    }
    return status
}

fun calcularIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}