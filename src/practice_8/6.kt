package practice_8

import kotlin.random.Random

private fun func(a:Int, b:Int):Boolean{
    return a + b < 100
}

fun main(){
    val a = Random.nextInt(100)
    val b = Random.nextInt(100)
    println("a: $a\nb: $b\na + b < 100 is ${func(a, b)}")
}