package practice_7

import kotlin.math.pow

fun main(){
    println("Калькулятор")
    print("Операция >> ")
    val op = readln()
    print("a >> ")
    val a = readln().toDouble()
    print("b >> ")
    val b = readln().toDouble()
    when(op){
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        "%" -> println("$a % $b = ${a % b}")
        "//" -> println("$a // $b = ${a.toInt() / b.toInt()}")
        "^" -> println("$a ^ $b = ${a.pow(b)}")
    }
}