package practice_10

private fun pyramid(size:Int){
    for(i in 0..<size){
        println(" ".repeat(size - 1 - i) + "#".repeat(1 + 2 * i) + " ".repeat(size - 1 - i))
    }
}

fun main(){
    print("size >> ")
    val size = readln().toInt()
    pyramid(size)
}