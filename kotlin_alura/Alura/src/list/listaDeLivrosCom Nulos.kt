package list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}") //joinToString seleciona apenas o ‘item’ da lista
        }
}