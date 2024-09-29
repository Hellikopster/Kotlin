package `practice 6`

import kotlin.random.Random

fun main(){
    val array = IntArray(11) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println()
    println("Медиана: ${array.sortedArray()[array.size / 2]}")
}