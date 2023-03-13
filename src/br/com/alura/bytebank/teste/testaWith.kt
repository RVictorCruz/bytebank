package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua das margaridas"
        numero = 101
        bairro = "Só Deus sabe"
        cidade = "MA"
        cep = "65000-00"
        complemento = "Perto de onde judas perdeu as botas"
        completo()
    }.let(::println)  //ou {enderecoCompleto: String-> println(enderecoCompleto)}

}
