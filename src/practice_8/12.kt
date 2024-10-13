package practice_8

private fun google(n:Int){
    println("G${"o".repeat(n)}gle")
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    google(n)
}