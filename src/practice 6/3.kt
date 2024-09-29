package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10, { Random.nextInt(1, 100)})
    var max = 0
    var min = Int.MAX_VALUE
    for(i in arr) {
        print("$i ")
        if(max < i) max = i
        if(min > i) min = i
    }
    println("\nМаксимальное: $max\n" +
            "Минимльное: $min")
}