package `practice 6`

import kotlin.random.Random

fun main(){
    val array = IntArray(20) {Random.nextInt(10)}
    array.forEach {print("$it ")}; println()
    var prev = array[0]
    var maxSize = 1
    var curSize = 1
    var value = 0
    for(i in 1..<array.size){
        if(array[i] == prev) curSize++
        else {
            if(maxSize < curSize) {
                maxSize = curSize
                value = prev
            }
            curSize = 1
        }
        prev = array[i]
    }
    println(if(maxSize < 2) "Последовательности не найдены" else "Максимальный размер последовательности $maxSize из чисел $value")
}