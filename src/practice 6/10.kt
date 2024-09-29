package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(100) }
    for(i in arr) print("$i ")
    println()
    var sum = 0
    for(i in arr) if(i % 2 == 0) sum += i
    println("Сумма: $sum")
}