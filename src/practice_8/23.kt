package practice_8

private fun length(word:String):Int{
    return word.length
}

fun main(){
    print("Слово >> ")
    val word = readln()
    println("Символов: ${length(word)}")
}