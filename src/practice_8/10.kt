package practice_8

private fun repetition(text:String, n:Int){
    if(n > 0){
        println(text)
        repetition(text, n - 1)
    }
}

fun main(){
    print("text >> ")
    val text = readln()
    print("n >> ")
    val n = readln().toInt()
    repetition(text, n)
}