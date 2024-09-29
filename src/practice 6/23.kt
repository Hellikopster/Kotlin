package `practice 6`

import kotlin.random.Random

fun concatArrays(vararg arrays: IntArray) : IntArray{
    var result = IntArray(0)
    for(i in arrays) result += i
    return result
}

fun main(){
    val array1 = IntArray(4) {Random.nextInt(100)}
    for(i in array1) print("$i "); println()
    val array2 = IntArray(4) {Random.nextInt(100)}
    for(i in array2) print("$i "); println()
    val array3 = IntArray(4) {Random.nextInt(100)}
    for(i in array3) print("$i "); println()
    for(i in concatArrays(array1, array2, array3)) print("$i "); println()

}