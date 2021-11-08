import Pacote.Employee

 class Representante(nome: String, sobrenome: String, registro: Int, idade: Int, diastrab: Int, diasferias: Int, salario: Double,
                         anostrab: Int, var vendasfeitas: Double = 0.0)
    : Employee(nome, sobrenome, registro, idade, diastrab, diasferias, salario, anostrab){

    fun calculaComissao(){
        var comissao = 0.1 * vendasfeitas
        println("O total de cada funcionário é $vendasfeitas")
    }
}