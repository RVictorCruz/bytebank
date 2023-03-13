package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno


fun testaHOF() {
    //“higher order functions”
    soma(10, 11, resultado = (::println))
    somaReceiver(10,11, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 12345
        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistema = SistemaInterno()
    SistemaInterno().entra(autenticavel, 12345, autenticado =  {
        println("realizar pagamento")
    })

    sistema.entraReceiver(autenticavel, 12345, autenticado = {
        pagamento()
    })
}


fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")

}
fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Antes da soma")
    val total = a + b
    total.resultado()
    println("Depois da soma")

}
