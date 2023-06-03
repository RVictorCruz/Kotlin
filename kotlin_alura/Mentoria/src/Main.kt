
fun main() {
    println("\n Vamos iniciar o seu cadastro no nosso banco!!!")
    println(" Por favor digite o seu nome: ")
    val nome = readLine()!!
    println("---------------------------------------------------")

    println("Por favor digite o seu Sobrenome: ")
    val sobreNome = readLine()!!
    println("---------------------------------------------------")


    println("Por favor digite o seu numero de telefone: ")
    val telefone = readLine()!!
    println("---------------------------------------------------")


    println("Por favor digite o seu cpf: ")
    val cpf = readLine()!!
    println("---------------------------------------------------")

    val cliente = Cliente(nome, sobreNome, telefone, cpf )
    val conta = ContaBancaria("12345",   cliente)

    val agencia = conta.getAgencia()

    println("Cadastro realizado com sucesso!!!")
    println("---------------------------------------------------")
    println(" Dados Cadastrais")
    println(" Nome: ${cliente.nome} ${cliente.sobrenome} \n Telefone: ${cliente.getTelefone()} \n CPF: ${cliente.cpf}")
    println("---------------------------------------------------")
    println(" Dados Bancários")
    println(" Agência: $agencia  \n Conta: ${conta.getConta()} \n Saldo: ${conta.getSaldo()}")




}