package `practice 6`

import kotlin.random.Random

fun main(){
    val arr = Array(5, {Random.nextInt(100)})
    for(i in arr) print("$i "); println()
    println("Сумма: ${arr.sum()}\nПроизведение: ${arr.reduce {product, i -> product * i}}")
}