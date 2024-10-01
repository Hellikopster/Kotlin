package practice_7

fun main(){
    println("Находит палиндром")
    print(">> ")
    val word = readln()
    println("Это ${if(word == word.reversed()) "" else "не "}палиндром")
}