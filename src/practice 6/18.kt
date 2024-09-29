package `practice 6`

import kotlin.random.Random

fun main(){
    val arr = IntArray(30) { Random.nextInt(1, 100) }
    arr.forEachIndexed { index, value ->
        print("$value ")
        if ((index + 1) % 5 == 0) println()
    }
}