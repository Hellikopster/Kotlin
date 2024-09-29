package `practice 6`

import kotlin.random.Random

fun main() {
    val arr = Array(5) { Random.nextInt(1,5) }
    for(i in arr) print("$i ")
    println()
    var isPalindrom = true
    for(i in 0..(arr.size / 2)){
        if(arr[i] != arr[arr.size - i - 1]){
            isPalindrom = false
            break
        }
    }
    println(if(isPalindrom) "Это палиндром" else "Это не палиндром")
}