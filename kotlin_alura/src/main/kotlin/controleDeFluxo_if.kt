//Controle de fluxo if
//Descobrir a que faixa etaria
fun idade(anos: Int) = if (anos <= 10) {
    run {
        println("Parabéns ainda é criança")
    }
} else {
    when (anos) {
        in 11..17 -> {
            println("Você é adolescente, comporte-se!!!")
        }
        in 18..60 -> {
            println("Você é adulto já pode ser preso!!!")
        }
        else -> {
            println("Você chegou a melhor idade, sinto muito!!!")
        }
    }
}
fun main(){
    idade(28)
}