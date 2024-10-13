package practice_8

private fun func(a:Int):Boolean{
    return (a != 0) && (a % 2 == 0)
}

fun main(){
    print("a >> ")
    val a = readln().toInt()
    println("Четное: ${func(a)}")
}