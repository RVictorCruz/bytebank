package br.com.alura.bytebank.teste

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")

        saldo == 0.0 -> println("saldo neutra")

        else -> println("conta negativa")

    }
}