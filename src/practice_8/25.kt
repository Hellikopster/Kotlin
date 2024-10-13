package practice_8

private fun length(text:String):String{
    return text.uppercase()
}

fun main(){
    print(">> ")
    val text = readln()
    println(length(text))
}