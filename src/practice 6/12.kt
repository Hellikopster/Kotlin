package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(100) }
    for(i in arr) print("$i ")
    print("\nПервый индекс >> ")
    val a = readLine()?.toInt() ?: 0
    print("\nВторой индекс >> ")
    val b = readLine()?.toInt() ?: 0
    val tmp = arr[a]
    arr[a] = arr[b]
    arr[b] = tmp
    for(i in arr) print("$i ")
}