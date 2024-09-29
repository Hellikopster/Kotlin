package `practice 6`

import kotlin.random.Random

fun main(){
    val array = Array(5) {IntArray(5) {Random.nextInt(100)} }
    array.forEach { it.forEach { print("$it ") }; println() }
    for(i in 0..3)
        for(j in (1 + i)..4)
            array[i][j] = array[j][i].also {array[j][i] = array[i][j]}
    println()
    array.forEach { it.forEach { print("$it ") }; println() }
}