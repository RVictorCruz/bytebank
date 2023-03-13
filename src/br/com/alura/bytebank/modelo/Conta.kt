package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException


// variável global *fora de tudo
/*var totalContas = 0
    private set*/

abstract class Conta(
    var titular: Cliente,
    val numero: Int,
): Autenticavel {

    var saldo: Double = 0.0
        protected set

    //Manter um valor estático para contagem de contas abertas
    companion object {
        var total: Int = 0
            private set
    }


    init {
        println("Criando conta numero: $numero")
        /*  totalContas++*/
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, saldo solicitado: $valor")
        }

        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
    }

    class ContaCorrente(
        titular: Cliente,
        numero: Int,
    ) : Conta(
        titular = titular,
        numero = numero
    ) {
        override fun saca(valor: Double) {
            val valorComTaxa = valor + 0.1
            if (this.saldo >= valorComTaxa) {
                this.saldo -= valorComTaxa
                println("valor sacado: $valor \nsaldo antigo: ${saldo + valor} \nvalor atual: $saldo")
            } else {
                println("Saldo insuficiente")
            }
        }
    }

    class ContaPoucanca(
        titular: Cliente,
        numero: Int,
    ) : Conta(
        titular = titular,
        numero = numero
    ) {
        override fun saca(valor: Double) {
            if (this.saldo >= valor) {
                this.saldo -= valor
            }
        }
    }
}