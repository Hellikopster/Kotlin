package practice_8

import kotlin.random.Random

private fun concat(a:Array<Int>, b:Array<Int>):Array<Int>{
    return a + b
}

fun main(){
    val array1 = Array(10) {Random.nextInt(100)}
    println("Array1:")
    array1.forEach { print("$it ") }; println()
    val array2 = Array(10) {Random.nextInt(100)}
    println("Array2:")
    array2.forEach { print("$it ") }; println()
    val array3 = concat(array1, array2)
    println("Array3:")
    array3.forEach { print("$it ") }; println()

}