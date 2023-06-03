class Carro(
    override var nome:String,
    override var qtdRodas: Int) : Veiculo(){

    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas")
    }
    fun acelerar(intensidade: Int) {
        println("Acelerar $nome com $qtdRodas rodas e intensidade $intensidade")
    }
}