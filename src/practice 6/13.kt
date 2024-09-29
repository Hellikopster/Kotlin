package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(20) { Random.nextInt(1,101) }
    for(i in arr) print("$i ")
}