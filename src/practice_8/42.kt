package practice_8

import kotlin.random.Random

private fun indexOf(array:IntArray, element:Int):Int{
    return array.indexOf(element)
}

fun main(){
    val array = IntArray(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    print("Элемент >> ")
    val element = readln().toInt()
    println(indexOf(array, element))
}