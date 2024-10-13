package practice_8

import kotlin.random.Random

private fun maxMin(array:Array<Int>):Pair<Int, Int>{
    return Pair(array.max(), array.min())
}

fun main(){
    val array = Array(10) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    val values = maxMin(array)
    println("max: ${values.first}\nmin: ${values.second}")
}