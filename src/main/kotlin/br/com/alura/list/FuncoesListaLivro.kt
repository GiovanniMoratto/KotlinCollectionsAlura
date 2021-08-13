package br.com.alura.list

/**
 *@Author giovanni.moratto
 */

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" #### Lista de Livros #### \n$textoFormatado")
}