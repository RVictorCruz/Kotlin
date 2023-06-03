fun main() {
    val salarios = doubleArrayOf(1500.00, 2300.0, 8000.00, 10000.00)
     val aumento = 0.1
    for ((indice, salario) in salarios.withIndex()){
        salarios[indice] = salario * aumento
        println(salarios[indice])
    }
    var indice1 =0
    for (salario in salarios){
        salarios[indice1] = salario * aumento
        println(salarios[indice1])
        indice1++
    }

    for(indice in salarios.indices){
        salarios[indice] = (salarios[indice] * aumento)
    }
    println(salarios.contentToString()) //Adiciona a lista na horizontal

    salarios.forEachIndexed{i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString()) //Adiciona a lista na horizontal
    val contatos = Array<String>(3){""}
    contatos[0] = "Eu"
    contatos[1] = "Eu mesmo"
    contatos[2] = "Victor"

    println(contatos.contentToString())
    println(contatos[2])


}