package practice_8

import kotlin.random.Random

private fun func(minutes:Int, fps:Int):Int{
    return minutes * 60 * fps
}

fun main(){
    val minutes = Random.nextInt(100)
    val fps = Random.nextInt(121)
    println("minutes: $minutes\nfps: $fps\nВсего кадров: ${func(minutes, fps)}")
}