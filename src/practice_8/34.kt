package practice_8

import kotlin.random.Random

private fun removeSpaces(s:String):String{
    return s.filter { c:Char -> c != ' ' }
}

fun main(){
    print("s >> ")
    val s = readln()
    print(removeSpaces(s))
}