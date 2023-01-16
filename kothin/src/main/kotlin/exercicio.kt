import kotlin.math.*

fun main(){
    val nome = "Victor Cruz"
    val pib : Long = 1869000000000
    val populacao = 211000000
    println("${pib/populacao}")
    println("Me chamo $nome a população do país \n em que vivo é $populacao que tem o pib nacional de $pib")

    println("Para atingir o número santo é necessário soma 12 + 9 que é igual a ${soma(12, 9)}")
    println("Para atingir o número santo é necessário multiplicar 7 * 3 que é igual a ${multiplicacao(7, 3)}")

    //Funções de String
    println("O tamanho da string: ${nome.length}")
    println("procurar um posição na String (index) ${nome[6]}")
    println("Para saber se a String começa com um ou varios caracteres ${nome.startsWith("Vict")}")
    println("Para saber se a String termina com um ou varios caracteres ${nome.endsWith("ruz")}")
    println("Para escolher um intervalo dentro da String ${nome.substring(2, 8)}")

    println("fazer alteração dentro da String ${nome.replace("Cruz", "Cruz é um anjo!!")}")
    println(nome)
    println("Letras minusculas ${nome.lowercase()}")
    println("Letras maiusculas ${nome.uppercase()}")

    println(max(7, 3))
    println(min(7, 3))
    print(sqrt(100.00f))
    println(PI)
    println(E)
    println(round(20.60504f))
    val numeroAleatoria = round(Math.random() * 10)
    println(numeroAleatoria.toInt())
    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)
    val i4: Int = b2.toInt() // OK!
    println(i4)




}
fun soma (a: Int, b: Int): Int {
    return a+b
}
fun multiplicacao(a: Int, b: Int) = a*b