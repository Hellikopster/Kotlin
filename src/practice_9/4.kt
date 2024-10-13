package practice_9

private fun anagram(word1:String, word2:String):Boolean{
    val w2 = word2.lowercase()
    if(word1.length != word2.length) return false
    for(i in word1.lowercase()){
        val index = w2.indexOf(i)
        if(index > -1) w2.replaceFirst(i, ' ')
        else return false
    }
    return true
}

fun main(){
    print("Первое слово >> ")
    val word1 = readln()
    print("Второе слово >> ")
    val word2 = readln()
    println("Анаграмма: ${anagram(word1, word2)}")
}