package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(5, { Random.nextInt(1, 100)})
    for(i in arr) print("$i ")
}