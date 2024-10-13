package practice_8

import kotlin.random.Random

private fun reversed(array:Array<Int>, index:Int):Int{
    return array[index]
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    print("index >> ")
    val index = readln().toInt()
    println(reversed(array, index))
}