package practice_8

private fun reversed(s:String):String{
    return s.reversed()
}

fun main(){
    print("s >> ")
    val s = readln()
    println(reversed(s))
}