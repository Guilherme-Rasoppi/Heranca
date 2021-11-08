import Pacote.Employee

fun main(args: Array<String>) {

    val pedro = Representante("Pedro","Silva", 566778, 28,360,30,3400.0,1)
    val maria = Representante("Maria","Silva", 566678, 28,360,30,3400.0,1)

    val rafael = Gerentevendas("Rafael","Silva", 56778, 30,360,30,3400.0,1)

    maria.vendasfeitas = 3000.0
    pedro.vendasfeitas = 4000.0

    val listafun = mutableListOf(maria,pedro)

    rafael.cadastrar(listafun)

    println(rafael.listaFuncionario.size)

    rafael.calculaComissao()

    rafael.mostraFun()

















}




