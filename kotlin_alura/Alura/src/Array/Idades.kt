fun main() {
    val idades: IntArray = intArrayOf(10,12,18,33,40,67)
    val maiorIdade = idades.max()
    println(maiorIdade)

    val menoridade = idades.min()
    println("Menor Idade: $menoridade")

    val media: Double = idades.average()
    println("Média: $media")

    val todosMaiorIdade = idades.all { it >= 18 }
    println("todos são maiores idade? $todosMaiorIdade")

    val existeMaior = idades.any { it >= 18 }
    println("Alguém é maior de idade: $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca 18 ou maior de 18: \n valor encontrado:$busca")

}