package `practice 6`

import kotlin.random.Random

fun main(){
    val array = IntArray(10) {Random.nextInt(100)}
    array.forEach {print("$it ")}; println()
    println("Среднее арифметическое: ${String.format("%.2f", array.sum().toDouble() / array.size)}")
}