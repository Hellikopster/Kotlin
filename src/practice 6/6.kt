package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(100) }
    for(i in arr) {
        print("$i ")
    }
    println()
    var even = 0
    var notEven = 0
    val arrE = Array(10) {0}
    val arrNE = Array(10) {0}
    for(i in arr){
        if(i % 2 == 0) arrE[even++] = i
        if(i % 2 == 1) arrNE[notEven++] = i
    }
    for(i in 0..<even) print("${arrE[i]} ")
    println()
    for(i in 0..<even) print("${arrNE[i]} ")
}