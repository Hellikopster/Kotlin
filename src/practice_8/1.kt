package practice_8

import kotlin.random.Random

private fun sum(array: Array<Int>):Int{
    return array.sum()
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    println("Сумма: ${sum(array)}")
}