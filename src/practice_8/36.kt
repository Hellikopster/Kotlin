package practice_8

private fun indexOf(s:String, find:String):Int{
    return s.indexOf(find)
}

fun main(){
    print("s >> ")
    val s = readln()
    print("find >> ")
    val find = readln()
    println(if(indexOf(s, find) == -1) "Не найдено" else "Найдено")
}