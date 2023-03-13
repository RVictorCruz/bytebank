package br.com.alura.bytebank.teste
//Function type
//    testaTipoFuncaoClasse()
//    testeTipoFuncaoReferencia()

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima =
        fun(a: Int, b: Int): Int {     //   val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int{
            return a + b
        }
    println("A + b = ${minhaFuncaoAnonima(15, 6)}")
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 3000) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(4000.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->    //    val minhaFuncaoLambda:(Int, Int) ->Int = {a,b ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario->
        if (salario > 2000){
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonificacao(5800.00))


}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()   //Declarando o tipo val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses(7,14))
}

fun testeTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma  //a referência no lugar da execução, val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao(10,11))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}
class Soma:(Int, Int) -> Int {

    override fun invoke(a: Int, b: Int): Int = a + b

}