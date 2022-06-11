fun main() {
//    println("Welcome to ByteBank!")
//    val contaAlex = Conta()
//    contaAlex.titular= "Alex"
//    contaAlex.numero=1000
//    contaAlex.saldo=200.0
//
//    val contaFran = Conta()
//    contaFran.titular= "Fran"
//    contaFran.numero=1001
//    contaFran.saldo=199.0
//
//
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)
//
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}
//    fun testaLacos() {
//        var i = 0
//        while (i < 5) {
//            val titular = "Victor $i"
//            val numeroConta = 1000 + i
//            val saldo = i + 10.0
//
//            println("titular $titular")
//            println("numero da conta $numeroConta")
//            println("saldo $saldo")
//            println()
//            i++
//        }
//    }
//    fun testaCondicoes(saldo: Double) {
//        when {
//            saldo > 0.0 ->
//                println("conta é positiva")
//            saldo == 0.0 ->
//                println("conta neutra")
//            else ->
//                println("conta negativa")
//        }
//    }