package `practice 6`

import kotlin.random.Random

fun main(){
    println("Поиск элемента")
    val array = IntArray(10) {Random.nextInt(100)}
    array.forEach {print("$it ")}; println()
    print(">> ")
    val element = readLine()?.toInt() ?: 0
    println(array.indexOf(element) != -1)
}