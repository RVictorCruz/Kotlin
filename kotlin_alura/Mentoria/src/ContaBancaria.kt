import kotlin.random.Random

class ContaBancaria(

    private var senha: String = "",
    private var cliente: Cliente,
    private var agencia: Int = Random.nextInt(0, 100),
    private var conta: Int = Random.nextInt(0, 100),
    private var saldo: Double = 0.0,
    private var usuarioAutenticado: Boolean = false


) {
    init {
        if(this.agencia != 0 && this.conta != 0 && this.senha != "" && this.cliente.nome != ""){
            println("Seja vem vindo ao nosso banco ${cliente.nome}")
            usuarioAutenticado = true
        }
    }


    fun getSaldo(): Double {
        return this.saldo
    }
    fun depositar(valor: Double){
        this.saldo =+ valor
    }
    fun sacar(valor: Double){
        if (this.saldo >= valor){
            this.saldo =- valor
        }else{
            println("Saldo insuficiente")
        }
    }
    fun getAgencia(): Int {
        return this.agencia
    }
    fun extrato(dias: String){
        println("Extrato dos últimos $dias dias ")
    }
    fun extrato(dataInicial: String, dataFinal: String){
        println("Extrato intervalo $dataInicial e $dataFinal ")

    }
     fun getConta(): Int {
        return this.conta
    }
    /*/fun getSenha(senha : String){
        this.senha = senha
    }
    * */




}