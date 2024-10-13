package practice_8

import kotlin.random.Random

private fun indexOf(array:Array<Int>, element:Int):Int{
    return array.indexOf(element)
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    print("find >> ")
    val element = readln().toInt()
    println(if(indexOf(array, element) == -1) "Элемент не найден" else "Элемент найден")
}