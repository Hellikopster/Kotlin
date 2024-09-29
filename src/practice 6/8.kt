package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(100) }
    for(i in arr) print("$i ")
    print("\nНайти значение >> ")
    val value = readLine()?.toInt() ?: 0
    val result = arr.indexOf(value)
    if(result == -1) println("$value не найдено")
    else println("$value под $result индексом")
}