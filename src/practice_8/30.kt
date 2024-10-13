package practice_8

import kotlin.random.Random

private fun sum(n:Int):Int{
    return Array(n) {it + 1}.sum()
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    println("sum: ${sum(n)}")
}