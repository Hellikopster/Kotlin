package practice_9

private fun simple(n:Int):Boolean{
    for(i in 2..(n/2)) if(n % i == 0) return false
    return true
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    println("Простые числа:")
    for(i in 1..n) if(simple(i)) println(i)
}