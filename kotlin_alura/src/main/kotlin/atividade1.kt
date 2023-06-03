
fun tempo (ano : Int) {

    println("$ano anos equivalem a:")
    val mes = ano * 12
    println("$mes meses")
    val dias = ano * 365
    println("$dias dias")
    val horas = dias * 24
    println("$horas horas")
    val minutos = horas * 60
    println("$minutos minutos")
    val segundo = minutos * 60
    println("$segundo segundos")

}
fun quantidade (palavra : String) = println("a palavra $palavra tem ${palavra.length} caracteres")

fun cubo (cubo : Int){
   val numeroCubico = cubo * cubo * cubo
    println("o numero cubico de $cubo é $numeroCubico")
}
fun milha(km : Float){
    val milhas = km * 1.6f
    println("$km km são $milhas milhas")

}
fun soletrando(nome : String){
    println("a troca das letra(as) a por x ${nome.replace("a", "x")}")
    println("a troca das letra(as) A por x ${nome.replace("A", "x")}")

}
fun main(){
    tempo(2)
    println()

    quantidade("Victor")
    println()

    cubo(7)
    println()

    milha(2.0f)
    println()

   soletrando("casa")

}