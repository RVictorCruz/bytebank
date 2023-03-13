package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao(){
    val gerente = Gerente(
        "Victor",
        "789-456-123.69",
        5000.0,
        1212
    )
    val diretor = Diretor(
        "Victor",
        "123-456-789.88",
        10000.00,
        98745,
        1000.0
    )
    val cliente = Cliente(
        "Julius",
        "123-456-789.11",
        159753
    )


    val sistema = SistemaInterno()
    sistema.entra(gerente, 1212)
    sistema.entra(diretor, 98745)
    sistema.entra(cliente, 159753)
}