package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    println("Bem vindo ao ByteBank")

    val victor = Analista(
        "Victor",
        "111.222.333-44",
        2000.00,
    )

    println("nome: ${victor.nome}")
    println("cpf: ${victor.cpf}")
    println("salario: ${victor.salario}")

    println("Bonificação: ${victor.bonificacao}")
    println("\n---------------------------------\n")


    val fran = Gerente(
        "Fran",
        "789-456-123-.55",
        3000.00,
        123456
    )
    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("CPF: ${fran.cpf}")
    println("Bonificação: ${fran.bonificacao}")
    if (fran.autentica(123456)) {
        println("Autenticou com sucesso!!")
    } else {
        println("falha na autenticação")
    }
    println("\n---------------------------------\n")

    val gui = Diretor(
        "Gui",
        "456-789-123.44",
        5000.00,
        789456,
        500.00
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("CPF: ${gui.cpf}")
    println("Bonificação: ${gui.bonificacao}")
    println("plr: ${gui.plr}")
    if (gui.autentica(789456)) {
        println("Autenticou com sucesso!!")
    } else {
        println("falha na autenticação")
    }

    val antonio = Analista("Antonio", "159-753-852.69", 3500.0)


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(victor)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(antonio)

    println("Bonificação ${calculadora.total}")
}
