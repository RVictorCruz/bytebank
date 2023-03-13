package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    testaTudo1("oi")
    testaTudo1(1)
    testaTudo1(1.0)
    testaTudo1(2.5f)
    val endereco = Endereco(
        logradouro = "Rua do fio",
        complemento = "próximo a associação",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Sacavém",
        numero = 21,
        cep = "00000-000"
    )

    // Comportamentos de any
    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode()) // maneira de tentar identificar o objeto como um cpf
    println(endereco.toString())
    println("${enderecoNovo.javaClass}@${Integer.toHexString(endereco.hashCode())}") //transforma o endereco em String e converte de numero inteiro para hexa decimal


    println(endereco.equals(enderecoNovo))

}
fun testaTudo1(tipo: Any?) {
    println(tipo)
}