package practice_8

private fun simple(n:Int):Boolean{
    for(i in 2..(n/2)) if(n % i == 0) return false
    return true
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    println("Простое: ${simple(n)}")
}