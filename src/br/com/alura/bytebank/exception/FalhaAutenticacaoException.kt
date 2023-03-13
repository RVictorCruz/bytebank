package br.com.alura.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "falha na autenticação"
) : Exception(mensagem)
