package list

val listaDeLivros = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora B"
    ),
    Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )
)


val listaDeLivrosCoNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )
)