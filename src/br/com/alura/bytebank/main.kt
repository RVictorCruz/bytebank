package br.com.alura.bytebank

fun main() {

    val pedidos = listOf(
        Pedido(1, 10.0),
        Pedido(2, 12.0),
        Pedido(3, 13.0),
        Pedido(4, 14.0),
        Pedido(5, 15.0)

    )
    println(pedidos[1])
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidoFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidoFreteGratis)
    println(pedidoFreteGratis[Pedido(2,12.0)])
}

data class Pedido(val numero: Int, val valor: Double)































