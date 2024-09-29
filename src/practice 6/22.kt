package `practice 6`

import kotlin.random.Random

fun main(){
    var arr = IntArray(10) {Random.nextInt(100)}
    for(i in arr) print("$i "); println()
    val secondMax = arr.filter {it != arr.max()}.max()
    println("Второе по величине число: $secondMax")
}