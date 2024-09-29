package `practice 6`

import kotlin.random.Random

fun removeElement(arr: IntArray, element: Int): IntArray{
    return arr.filter {it != element}.toIntArray()
}

fun main(){
    println("Удаление элемента")
    var arr = IntArray(10) {Random.nextInt(100)}
    for(i in arr) print("$i "); println()
    print("Элемент >> ")
    val element = readLine()?.toInt() ?: 0
    arr = removeElement(arr, element)
    for(i in arr) print("$i "); println()

}