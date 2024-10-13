package practice_8

import kotlin.random.Random

private fun func(array:Array<Int>):Int{
    return array.max() - array.min()
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    println("Разность: ${func(array)}")
}