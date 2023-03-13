package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaobject() {
    //objeto anônimo
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111-222-333.55"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome do cliente ${fran.nome}")
    println("Total de contas: ${Conta.total}")


    /* val victor = Cliente("Victor", "789-456-123.55", 1)
     val contaPoucanca =ContaPoucanca(victor, 123)
     val contaCorrente =ContaCorrente(victor, 123)


     testaContasDiferentes()
     println("Total de contas: $totalContas")*/
}
