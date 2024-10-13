package practice_8

private fun factorial(n:Int):Int{
    var fact = 1
    for(i in 2..n) fact *= i
    return fact
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    println("Факториал: ${factorial(n)}")
}