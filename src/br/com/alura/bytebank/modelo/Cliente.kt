package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int,
    var endereco: Endereco = Endereco(),
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return senha == this.senha
    }
}