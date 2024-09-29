package `practice 6`

import kotlin.random.Random

fun main(){
    val array = IntArray(100) {Random.nextInt(100)}
    array.forEach { print("$it ") }; println("\n")
    array.forEachIndexed {i, value ->
        print("%02d ".format(value))
        if((i + 1) % 10 == 0) println()
    }
}