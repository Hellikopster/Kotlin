package practice_8

private fun polindrom(word:String):Boolean{
    return word == word.reversed()
}

fun main(){
    print("Слово >> ")
    val word = readln()
    println("Полиндром: ${polindrom(word)}")
}