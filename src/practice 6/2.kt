package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(5, { Random.nextInt(1, 100)})
    var sum = 0
    for(i in arr) {
        print("$i ")
        sum += i
    }
    println("\nСумма: $sum")
}