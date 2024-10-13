package practice_8

private fun max(a:Int, b:Int):Int{
    return if(a > b) a else b
}

fun main(){
    print("a >> ")
    val a = readln().toInt()
    print("b >> ")
    val b = readln().toInt()
    println("Максимальное: ${max(a, b)}")
}