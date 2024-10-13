package practice_8

import kotlin.random.Random

private fun newArray(n:Int):Array<Int>{
    return Array(n) {Random.nextInt(100)}
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    val array = newArray(n)
    array.forEach { print("$it ") }
}