package practice_9

fun main(){
    print("Строка >> ")
    val input = readln()
    val s = StringBuilder()
    for(char in input){
        if(char.isUpperCase()) s.append(char.lowercase())
        else s.append(char.uppercase())
    }
    println(s)
}