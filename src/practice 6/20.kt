package `practice 6`

import kotlin.random.Random

fun main(){
    println("Вывод элементов арифметической прогрессии")
    print("Начало >> ")
    val start = readLine()?.toInt() ?: 0
    print("Шаг >> ")
    val step = readLine()?.toInt() ?: 0
    print("Количество элементов >> ")
    val size = readLine()?.toInt() ?: 0

    val arr = Array(size) {start + it * step}
    for(i in arr) print("$i "); println()

}