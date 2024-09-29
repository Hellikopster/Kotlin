package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(100) }
    for(i in arr) {
        print("$i ")
    }
    println()
    for(i in arr){
        var count = 0
        for(j in arr){
            if(i == j){
                count++
            }
        }
        if(count == 1) print("$i ")
    }
}