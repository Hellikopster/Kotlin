package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = List(10) { Random.nextInt(100) }
    val arr2 = List(10) { Random.nextInt(100) }
    for(i in arr) print("$i ")
    println()
    for(i in arr2) print("$i ")
    println()
    for(i in arr.intersect(arr2.toSet())) print("$i ")
}