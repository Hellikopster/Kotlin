package practice_9

private class CountLetters(var vowels:Int, var consonants:Int)

private fun countVowelsConsonants(word:String):CountLetters{
    val count = CountLetters(0, 0)
    val vowels = arrayOf('ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'a', 'e', 'i', 'o', 'u', 'y')
    for(i in word.lowercase())
        if(i in vowels) count.vowels++
        else if(i.isLetter()) count.consonants++
    return count
}

fun main(){
    print("Слово >> ")
    val word = readln()
    val count = countVowelsConsonants(word)
    println("Гласных: ${count.vowels}\nСогласных: ${count.consonants}")
}