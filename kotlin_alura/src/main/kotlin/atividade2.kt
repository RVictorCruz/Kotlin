fun formageometrica(lado1 : Int, lado2 : Int) {
    if (lado1 == lado2){
        println("Lados iguais formam um quadrado")
    }else{
        println("o lado1 é $lado1 e lado2 é $lado2, não é um quadrado")
    }
}
fun triangulo(lado1: Int, lado2: Int, lado3: Int){
    if (lado1 == lado2 && lado2 == lado3){
        println("você formou um triangulo equilatero")
    }else{
        println("Você não fomrou um triângulo equilatero")
    }
}
fun qualAsaida(num : Int){
    if(num >= 0){
        if (num == 0)
            println("Primeira string")
            else println("Segunda string")
        }
        println("Terceira string")
    }
fun evento (idade: Int, convite: String, codigo: String){
    if(idade >= 18){
        if(convite == "comum" || convite == "premium" || convite == "luxo"){
            if (codigo == "XL" || codigo == "XT"){
                println("Welcome :) ")
            }else{
                println("Negado. Convite Inválido")
            }
        }
    }else {
        println("Negado. Menores de idade não são premitidos")
    }
}
fun evento2(idade: Int, convite: String, codigo : String){

}
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }



fun main(){
    val x : String? = readLine()
    formageometrica(10, 10)
    triangulo(10, 20, 30 )
    qualAsaida(21)
    evento(18, "premium", "XL")
    evento(1,"primium", "XL" )

        println(describe(1))
        println(describe("Hello"))
        println(describe(1000L))
        println(describe(2))
        println(describe("other"))

}