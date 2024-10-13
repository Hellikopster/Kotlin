package practice_8

import kotlin.random.Random

private fun last(array:Array<Int>):Int{
    return array.last()
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    println(last(array))
}