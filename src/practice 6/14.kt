package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(1,101) }
    for(i in arr) print("$i ")
    println()
    for(i in arr) if(i % 3 == 0) print("$i ")
}