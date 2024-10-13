package practice_9

fun main(){
    print("Текст >> ")
    val text = readln()
    val words = text.split(Regex("[^A-zА-я\\d]+"))
    var max = ""
    for(i in words) if(max.length < i.length) max = i
    println(max.ifEmpty { "Слово не найдено!" })
}