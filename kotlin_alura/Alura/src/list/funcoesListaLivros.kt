package list

//extension function
fun List<Livro?>.imprimeComMarcadores(){
    val textFormatado = this
        .filterNotNull() //.filter { it != null }
        .joinToString(separator = "\n") {
        " - Titulo: ${it.titulo} de ${it.autor} ano: ${it.anoPublicacao}"
    }
    println(" ### Lista de Livros ### \n$textFormatado")
}