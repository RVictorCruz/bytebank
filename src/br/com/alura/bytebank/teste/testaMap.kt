package br.com.alura.bytebank.teste

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido $pedido")
    }
    for (encomenda in pedidos) {
        println("número da chave do pedido: ${encomenda.key}")
        println("valor do pedido: ${encomenda.value}")
    }
    //Adicionar
    pedidos[5] = 4.0
    println(pedidos)
    pedidos.put(6, 7.0)
    println(pedidos)

    //sobrescrita
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(7, 21.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 5.0) // Se existir algo dentro dessa chave(key) ele não mudará

    //Remover
    pedidos.remove(7)
    println(pedidos)
    pedidos.remove(1, 10.0) // Só remove se essa chave possui esse valor
}
