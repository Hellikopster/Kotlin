package practice_8

import kotlin.random.Random

private fun func(prob:Int, prize:Int, pay:Int):Boolean{
    return prob * prize > pay
}

fun main(){
    val prob = Random.nextInt(100)
    val prize = Random.nextInt(100)
    val pay = Random.nextInt(100)
    println("prob: $prob\nprize: $prize\npay: $pay\nprob * prize > pay is ${func(prob, prize, pay)}")
}