package practice_10

private fun caesar(text:String, offset:Int):String{
    val str = StringBuilder(text.lowercase())
    for(i in str.indices){
        if(str[i] + offset > 'z') str[i] = str[i] + offset - 26
        else if(str[i] + offset < 'a') str[i] = str[i] + offset + 26
        else str[i] = str[i] + offset
    }
    return str.toString()
}

fun main(){
    print("Текст >> ")
    val text = readln()
    print("Смещение >> ")
    val offset = readln().toInt()
    val code = caesar(text, offset)
    println("Шифр: $code")
}