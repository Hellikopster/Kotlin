package practice_9

private fun dollarToEuro(value:Double):Double{
    return value * 0.91
}

fun main(){
    print("Доллар >> ")
    val dollars = readln().toDouble()
    println("В евро: ${dollarToEuro(dollars)}")
}