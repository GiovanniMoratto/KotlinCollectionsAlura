package br.com.alura.list

/**
 *@Author giovanni.moratto
 */

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
)