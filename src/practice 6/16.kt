package `practice 6`

import kotlin.random.Random

fun main(){
    val arr = Array(5, {Random.nextInt(100)})
    for(i in arr) print("$i "); println()
    val arr2 = Array(5, {Random.nextInt(100)})
    for(i in arr2) print("$i "); println()
    val arr3 = arr + arr2
    for(i in arr3) print("$i "); println()

}