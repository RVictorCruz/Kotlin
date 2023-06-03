abstract class Veiculo constructor(
    open var nome: String = "",
    open var qtdRodas: Int = 0
) {




    abstract fun acelerar()

   /* fun getNome(): String {
        return this.nome
    }
    fun getQtdRodas(): Int {
        return this.qtdRodas
    }*/

}