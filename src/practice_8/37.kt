package practice_8

private fun multipliplicationTable(num:Int){
    for(i in 1..10){
        println("$num * $i = ${num * i}")
    }
}

fun main(){
    print("num >> ")
    val num = readln().toInt()
    multipliplicationTable(num)
}