package practice_8

import kotlin.random.Random

private fun sort(array: Array<Int>){
    array.sort()
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    sort(array)
    array.forEach { print("$it ") }; println()
}