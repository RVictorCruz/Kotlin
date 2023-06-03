package list
fun main() {

    val livro = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "joão Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro1 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro2 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )
    val livro3 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )
    //Lista sempre trabalha com objetos e aceita método add ao contrário dos arrays
    val livros: MutableList<Livro> = mutableListOf(livro, livro1, livro2, livro3) //Lista Mutável = mutableListOf
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
   // livros.imprimeComMarcadores()

    //livros.remove(livro)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos: List<String> = listaDeLivros
        //.filter { it.autor == "João Guimarães Rosa"}
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo } //map cria uma lista utilizando as informações com it

    println(titulos)
}
