package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(100) }
    for(i in arr) print("$i ")
    println()
    val arr2 = arr.copyOf()
    for(i in arr2) print("$i ")
}