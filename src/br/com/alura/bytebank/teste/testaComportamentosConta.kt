package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta

fun testaComportamentosConta() {
    testaLacos()
    val victor = Cliente("Victor", "896-456-159.78", 54321)
    val contaVictor = Conta.ContaCorrente(titular = victor, numero = 21) //Utilizando labels
    contaVictor.deposita(10000.00)

    val fran = Cliente("Fran", "159-456-159.78", 54321)
    val contaFran = Conta.ContaPoucanca(fran, 22)
    println("**************************************\n")
    println("titular: ${contaVictor.titular}")
    println("titular2: ${contaFran.titular}")

    println("***** Depositando na conta de Victor *****")
    contaVictor.deposita(500.00)
    println("---Saldo da conta de Victor: ${contaVictor.saldo}")

    println("\n\n***** Depositando na conta de Victor *****")
    contaVictor.deposita(2000.00)
    println("---Saldo da conta de Victor: ${contaVictor.saldo}")

    println("\n\n***** Saca na conta de Victor *****")
    contaVictor.saca(200.00)

    println("\n\n***** Transferência entre conta de Victor e Fran *****")

    try {
        contaVictor.transfere(contaFran, 2000.00, 12345)
        println("Transferência bem sucedida")
    }catch (e: SaldoInsuficienteException) {
        println("Falha na transferência..")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    }catch (e: Exception){
        println("Erro desconhecido!!!")
        e.printStackTrace()
    }


    println("saldo de conta de Victor: ${contaVictor.saldo}")
    println("saldo de conta de Fran: ${contaFran.saldo}")
}