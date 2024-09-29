package `practice 6`

import kotlin.random.Random

fun main(){
    print("Размер массива >> ")
    val size = readLine()?.toInt() ?: 0
    var array = IntArray(size)
    array = array.map {readLine()?.toInt() ?: 0}.toIntArray()
    array.forEach {print("$it ")}; println()
}