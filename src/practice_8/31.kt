package practice_8

import kotlin.random.Random

private fun toFahrenheit(c:Double):Double{
    return (c * 9.0/5.0) + 32
}

fun main(){
    print("c >> ")
    val c = readln().toDouble()
    println("Fahrenheit: ${toFahrenheit(c)}")
}