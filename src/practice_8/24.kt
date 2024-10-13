package practice_8

private fun uppercase(text:String):String{
    return text.uppercase()
}

fun main(){
    print(">> ")
    val text = readln()
    println(uppercase(text))
}