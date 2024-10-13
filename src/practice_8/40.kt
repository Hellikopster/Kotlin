package practice_8

import kotlin.random.Random

private fun clone(array:IntArray):IntArray{
    return array.clone()
}

fun main(){
    val array = IntArray(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    val array2 = clone(array)
    array2.forEach { print("$it ") }; println()
}