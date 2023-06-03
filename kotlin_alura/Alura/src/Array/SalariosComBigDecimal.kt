import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "10000.00")
  /*  val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()*/

    println("1-------------------------------------------------------------------")
    println(salarios.contentToString())
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> =
        salarios.map { salario -> calculaAumentoRelativo(salario, aumento)}
            .toTypedArray()

    println("2-------------------------------------------------------------------")
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("3-------------------------------------------------------------------")

    println(gastoTotal)

    /*val salariosOrdenados = salariosComAumento.sorted()
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3)
        .toTypedArray()

    val media = tresUltimosSalarios.media()*/
    val media = salariosComAumento
        .sorted()//Ordenar do maior para o menor
        .takeLast(3)//selecionar os três ultimos
        .toTypedArray() //converter do tipo List para o tipo Array
        .media() // extrair a média dos 3 ultimos salários
    println("4-------------------------------------------------------------------")

    println(media)

    println("5-------------------------------------------------------------------")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()//Ordena do menor para o maior
        .take(3)   //seleciona os três primeiros
        .toTypedArray()  //converte do tipo list para o tipo Array
        .media()  //Tira a média

    println(mediaMenoresSalarios)
    println("6-------------------------------------------------------------------")

}
private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
    :BigDecimal{
    return if(salario < "5000".toBigDecimal()){
        salario + "500".toBigDecimal()
    }else{
        (salario * aumento).setScale(2,RoundingMode.UP)
    }

}
