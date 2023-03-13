package br.com.alura.bytebank.teste

fun testaRecebeString(nome: String) {
    1.let{
        it
    }

    teste(1, {})
}

//higher order function
fun teste(teste: Int, bloco: () -> Unit){
    "".let (:: testaRecebeString)
}