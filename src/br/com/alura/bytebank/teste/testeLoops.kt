package br.com.alura.bytebank.teste

fun main() {
    for (i in 1..5){
        println(i)
    }

    println("___________________________________")

    for (i in 5 downTo 1){
        println(i)
    }

    println("___________________________________")

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    println("___________________________________")

    var indice = 0
    while (indice <= 5){
        println(indice)
        indice++
    }
}