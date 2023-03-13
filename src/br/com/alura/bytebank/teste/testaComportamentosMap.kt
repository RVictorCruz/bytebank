package br.com.alura.bytebank.teste

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> =
        mutableMapOf( //Pair possui mais desempenho melhor, deve ser utilizado para altas quantidades de elementos
            Pair(1, 10.0),
            Pair(2, 11.0),
            3 to 12.0,
            4 to 12.0,
            5 to 15.0,
            6 to 250.0,
            7 to 67.0

        )
    println("------------------------------------------------")
    println("getValue")
    val valorPedido = pedidos.getValue(4) //Se o número da chave(key) não existir ele retorna um exception
    val valorPedido1 = pedidos[7]
    println(valorPedido)
    println(valorPedido1)

    println("------------------------------------------------")
    println("getOrElse")

    val mensagem = pedidos.getOrElse(4) {
        println("Não tem o perdido")
    }
    println(mensagem)
    println("------------------------------------------------")
    println("getOrDefault")
    println(pedidos.getOrDefault(1, 0.0)) //Pegue a chave 1, caso não exista nada imprima 0,0
    println(pedidos.getOrDefault(0, 0.0)) //Pegue a chave 0, caso não exista nada imprima 0,0

    println("------------------------------------------------")
    println("Impressão de Chaves e valores")
    for (chave in pedidos.keys) {
        println("Numeros dos pedidos: $chave")
    }
    for (valor in pedidos.values) {
        println("Valores: $valor")
    }
    println("------------------------------------------------")
    println("Filter")

    val pedidosFiltrados = pedidos.filter { (_, valor) ->
        valor % 2 == 0.0 && valor > 5.0
    }
    println(pedidosFiltrados)

    val chavesPares = pedidos.filterKeys {
        it % 2 == 0
    }
    println(chavesPares)
    val maioresQueDez = pedidos.filterValues {
        it > 10
    }
    println(maioresQueDez)

    println("------------------------------------------------")
    println("Adicionando novos itens sem alterar a lista original")

    println(pedidos + Pair(8, 12.0))
    println(pedidos + mapOf(Pair(9, 13.3), 10 to 14.4, Pair(11, 11.11)))
    println(pedidos + (21 to 21.21))
    println(pedidos)

    println("------------------------------------------------")
    println("Retirando itens sem alterar a lista original")

    println(pedidos - listOf(1, 2, 3))

    println("------------------------------------------------")
    println("Adicionando novos itens alterando a lista original")

    pedidos.putAll(setOf(8 to 12.2, 9 to 10.9, 10 to 55.5, Pair(11, 22.2)))
    println(pedidos)
    pedidos += listOf<Pair<Int, Double>>(Pair(12, 13.3), 14 to 15.5)
    println(pedidos)


    println("------------------------------------------------")
    println("Removendo itens alterando a lista original")

    pedidos.keys.remove(14)
    println(pedidos)
    pedidos.values.remove(15.0)
    pedidos.let(::println)
    pedidos.values.remove(12.0) // se tiverem dois valores iguais ele irá pegar o primeiro
    println(pedidos)

    pedidos -= 2
    println(pedidos)
}
