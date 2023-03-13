package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun testaNullable() {
    val endereco: Endereco? = Endereco(logradouro = "Rua das margaridas", complemento = "próximo a associação")
    println(endereco?.logradouro?.length)
    endereco.let {
        println(it?.logradouro)
        val tamanhoComplemento: Int =
            it?.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    soma("")
    soma(1)
}

fun soma(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}