package br.com.alura.bytebank.teste

fun testaLacos() {
    for (i in 1..5) {
        val titular = "RVictor $i"
        val numeroConta = 1000 + i
        var saldo: Double
        100.0.also {  saldo = it + i }

        if (i == 4) {
            //break // finaliza o loop
            continue //manda ir pro laço seguinte
        }
        var x = 2
        while (x > 0) {
            println("___________________________________")
            x--
        }


        do {
            val mestre = "Victor"
            println("Mestre: $mestre")
            x++
        } while (x < 2)
        println("___________________________________")


        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")
        testaCondicoes(saldo)


    }
}