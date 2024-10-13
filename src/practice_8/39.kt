package practice_8

import kotlin.random.Random

private fun reversed(array:IntArray){
    array.reverse()
}

fun main(){
    val array = IntArray(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    reversed(array)
    array.forEach { print("$it ") }; println()
}