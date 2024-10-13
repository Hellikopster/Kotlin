package practice_9

fun main(){
    print("Размер массива >> ")
    val n = readln().toInt()
    val array = Array(n) {readln()}
    array.sort()
    println("Отсортированный массив:")
    array.forEach { println(it) }
}