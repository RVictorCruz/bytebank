package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta

fun testaRun() {
    val taxaAnual = 0.04
    val taxaMensal = taxaAnual / 12

    val contaPoucanca = Conta.ContaPoucanca(Cliente(nome = "Victor", cpf = "123.456.789-85", senha = 123456), 12345)

    contaPoucanca.run {
        deposita(5000.00)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")


        val rendimentoAnual = run {
            var saldo = contaPoucanca.saldo
            repeat(12) {
                saldo += saldo * taxaMensal
            }
            saldo
        }

        println("simulação rendimento $rendimentoAnual")
    }
}
