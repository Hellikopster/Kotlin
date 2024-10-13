package practice_8

import kotlin.random.Random

private fun func(num:Int):Boolean{
    return (num % 100 == 0) && (num != 0)
}

fun main(){
    val num = Random.nextInt(1000)
    println("num: $num\nnum // 100 is ${func(num)}")
}