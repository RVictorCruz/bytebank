package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    /* val endereco = Endereco(logradouro = "Rua do fio", numero = 21)
     val enderecoEmMaiusculo = " ${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
     println(enderecoEmMaiusculo)*/

    Endereco(logradouro = "Rua do fio", numero = 21).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".uppercase()
    }.let {
        println(it)
    }
    run {
        println("Bora estudar mais!!")
    }


    val endereco1 = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "Rua do fio"
            numero = 21
        }


    with(endereco1) {
        "${logradouro}, $numero".uppercase()
    }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco ->
        endereco.complemento?.isNotEmpty() ?: false
    }.let(::println)
}
