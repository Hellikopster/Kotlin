package practice_8

private fun countVowels(word:String):Int{
    var count = 0
    val vowels = arrayOf('ё', 'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'a', 'e', 'i', 'o', 'u', 'y')
    for(i in word.lowercase()) if(i in vowels) count++
    return count
}

fun main(){
    print("Слово >> ")
    val word = readln()
    println("Гласных: ${countVowels(word)}")
}