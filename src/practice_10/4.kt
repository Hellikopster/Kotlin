package practice_10

private fun fizzBuzz(n:Int):Array<String>{
    return Array(n) {when{
        ((it + 1) % 3 == 0) and ((it + 1) % 5 == 0) -> "ВизллБизлл"
        (it + 1) % 3 == 0 -> "Физллл"
        (it + 1) % 5 == 0 -> "Бизлллл"
        else -> (it + 1).toString()
    }}
}

fun main(){
    print("n >> ")
    val n = readln().toInt()
    val array = fizzBuzz(n)
    print("[")
    for(i in array.indices) print(array[i] + if(i != array.lastIndex) ", " else "")
    println("]")
}