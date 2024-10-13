package practice_8

private fun sum(a:Int, b:Int):Int{
    return a + b
}

fun main(){
    print("a >> ")
    val a = readln().toInt()
    print("b >> ")
    val b = readln().toInt()
    println("Сумма: ${sum(a, b)}")
}