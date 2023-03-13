package br.com.alura.bytebank


fun testaCopia() {
    val bancoDeDados = BancoDeDados()
    bancoDeDados.salva("Victor")

    val nomesSalvos: Collection<String> = bancoDeDados.nome
    val bancoDeDados1 = BancoDeDados()
    bancoDeDados1.salva("Mestre")
    println(bancoDeDados1.nome)
    println(BancoDeDados().nome)
    println(nomesSalvos)
    println(bancoDeDados.nome)
}

class BancoDeDados{
    val nome: Collection<String> get() =  dados//.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object{
        private val dados = mutableListOf<String>()
    }
}


fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Victor",
        "Mestre",
        "Luz",
        "Danadinho",
        "Senhor dos mundos"
    )

    println(nomes)
    println("Tem Victor na lista? ${nomes.contains("Victor")}")
    println("Qual o tamanho da lista? ${nomes.size}")
}

