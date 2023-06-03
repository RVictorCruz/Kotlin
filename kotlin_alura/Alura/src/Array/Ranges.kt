fun main(){
    val serie: IntRange = 1.rangeTo(10)

    for(s in serie){
        print("$s  ")
    }
    println()

    val numerosPares = 0..100 step 2
    for(p in numerosPares){
        print("$p ")
    }

    println()
    val numerosImpares = 1.until(101) step 2 // não inclui o ultimo numero 1 >= impar && 101 < impar
    for(i in numerosImpares){
        print("$i ")
    }
    println()
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ")
    }

    println()
    val intervalo = 1500.00..5000.0
    val salario = 5010.0
    if (salario in intervalo){
        println("Está dentro do intervalo")
    }else{
        println("Está fora do intervalo")
    }


    val alfabeto = "a".."z"
    val letra = "v"
    println(letra in alfabeto)

}