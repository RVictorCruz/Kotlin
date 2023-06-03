fun main() {
    val idade1 = 21
    val idade2 = 18
    val idade3 = 31
    val idade4 = 38

    val maiorValor = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4){
        idade3
    }else{
        idade4
    }
    println("---------------------------------")

    println(maiorValor)
    println("---------------------------------")


    val idades = IntArray(5)
    idades[0] = 21
    idades[1] = 18
    idades[2] = 31
    idades[3] = 20
    idades[4] = 15

    val maximo = idades.max()
    println(maximo)
    println("---------------------------------")

    var maiorIdade = 0
    for (idade in idades){
        if (idade > maiorIdade){
            maiorIdade = idade
        }

    }
    println(maiorIdade)
    println("---------------------------------")

    val loteria : IntArray = intArrayOf(10,50,60,90,5,12,18)

    var jogo = Int.MIN_VALUE
    for(numero in loteria){
        if (numero > jogo){
            jogo = numero
        }
    }
    println(jogo)

    println("---------------------------------")

    var menorNumero = Int.MAX_VALUE
    loteria.forEach { numero ->
        if (numero < menorNumero){
            menorNumero = numero
        }
    }
    println(menorNumero)






}