package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta

fun testaCopiasEReferencias(){

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX: $numeroX")
    println("NumeroY: $numeroY")
    val joao = Cliente("João", "789-456-123.88", 12345)
    val maria = Cliente("Maria", "789-789-123.88", 12345)

    val contaJoao = Conta.ContaCorrente(joao, 23)
    val contaMaria = contaJoao
    contaMaria.titular = maria

    println(contaJoao.titular)
    println(contaMaria.titular)
}
