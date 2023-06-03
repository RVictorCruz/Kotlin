class Cliente(
    val nome: String = "",
    val sobrenome: String = "",
    private var telefone: String ="",
    val cpf: String = ""
    ){
    fun getTelefone(): String {
        return this.telefone
    }

}