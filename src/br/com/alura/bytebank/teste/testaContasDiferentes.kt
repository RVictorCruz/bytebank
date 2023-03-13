package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta

fun testaContasDiferentes() {
    val victor = Cliente("Victor", "896-456-159.78", 54321)
    val contaCorrente = Conta.ContaCorrente(
        victor,
        212121
    )
    val fran = Cliente("Fran", "159-456-159.78", 54321)
    val contaPoucanca = Conta.ContaPoucanca(
        fran,
        232332
    )

    contaCorrente.deposita(1000.0)
    contaPoucanca.deposita(1000.0)

    println("Saldo conta poupança: ${contaPoucanca.saldo}")
    println("Saldo conta corrente: ${contaCorrente.saldo}")

    println("----------------------------------------------")
    contaCorrente.saca(200.0)
    println("----------------------------------------------")
    contaPoucanca.saca(200.0)
    println("----------------------------------------------")

    println("Saldo conta poupança: ${contaPoucanca.saldo}")
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("----------------------------------------------")

    contaCorrente.transfere(contaPoucanca, 100.0, 54321)
    println("Saldo conta poupança após receber valor transferido : ${contaPoucanca.saldo}")
    println("Saldo conta corrente após enviar dinheiro para conta poupança: ${contaCorrente.saldo}")
    println("----------------------------------------------")

    contaPoucanca.transfere(contaCorrente, 200.0,12345)
    println("Saldo conta corrente após receber valor transferido : ${contaCorrente.saldo}")
    println("Saldo conta poupança após enviar dinheiro para conta corrente: ${contaPoucanca.saldo}")
    println("----------------------------------------------")
}
