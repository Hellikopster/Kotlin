package practice_8

private fun func(k:Int, n:Int):Boolean{
    return k*k == n
}

fun main(){
    print("k >> ")
    val k = readln().toInt()
    print("n >> ")
    val n = readln().toInt()
    println("k: $k\nn: $n\nk*k = n is ${func(k, n)}")
}