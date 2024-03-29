package list

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
    ){
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor } //novos objetos
    }
    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao } //novos objetos

    }
}
