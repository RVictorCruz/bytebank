package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    //property função
    abstract  val bonificacao: Double //open val bonificacao: Double get() = salario * 0.1


}

