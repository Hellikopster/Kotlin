package practice_7

fun main(){
    print("Количество >> ")
    val n = readln().toInt()
    val array = IntArray(n)
    for(i in 0..<n) array[i] = readln().toInt()
    println("Минимальное: ${array.min()}")
}