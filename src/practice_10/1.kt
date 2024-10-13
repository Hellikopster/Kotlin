package practice_10

private fun printNumber(n:Int):IntArray{
    val array = IntArray(n) {n - it}
    print("[")
    for(i in array.indices) print("${array[i]}${if(i != array.lastIndex) ", " else ""}")
    println("]")
    return array
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    printNumber(n)
}