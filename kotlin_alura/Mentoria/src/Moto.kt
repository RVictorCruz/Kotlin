class Moto(
    override var nome: String,
    override var qtdRodas: Int) : Veiculo(), Eletrificado {

    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas")
        motorEletrico()
    }
    fun acelerar(intensidade: Int) {
        println("Acelerar $nome com $qtdRodas rodas e intensidade $intensidade")
        motorEletrico()
    }

}