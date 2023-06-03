fun quadrado(){
    print("Informe o lado 1 :")
    val lado1 = readLine()
    print("infroma o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""){
        val x = lado1.toInt()
        val y = lado2.toInt()

        if(x == y) {
            println("É um quadrado.")
        }else {
            println("Não é um quadrado")
        }
    }
    }

fun triangulo() {
    print("Informe o lado1 do triângulo: ")
    var lado1 = readLine()

    print("Infome o segundo lardo: ")
    var lado2 = readLine()

    print("informe o lado2 do triângulo")
    var lado3 = readLine()

    if ((lado1 != null) && (lado1 != "") && (lado2 != null) && (lado2 !== "") && (lado3 != "") && (lado3 != null)) {
        lado1 = lado1.toString()
        lado2 = lado2.toString()
        lado3 = lado3.toString()

        if (lado1 == lado2 && lado2 == lado3) {
            println("É um triângulo equilátero!!! ")
        } else {
            println("Não é um triângulo equilátero!!!")
        }

    }
}

fun main(){
    quadrado()
    triangulo()
}