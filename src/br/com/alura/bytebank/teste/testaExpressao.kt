package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.lang.ClassCastException
import java.lang.NumberFormatException

 fun testaExpressao() {
    println("início main")

    val entrada: String = "1.9"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
    funcao1()
    println("fim main")
}
fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}
fun funcao2(){
    println("início funcao2")

    try {
        for(i in 1..5){
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    }catch (e: ClassCastException){
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    println("fim funcao2")
}