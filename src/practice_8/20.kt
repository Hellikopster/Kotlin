package practice_8

import kotlin.random.Random

private fun max(array: Array<Int>):Int{
    return array.max()
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    println("Максимальное: ${max(array)}")
}