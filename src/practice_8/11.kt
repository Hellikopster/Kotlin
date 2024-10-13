package practice_8

private fun equation(expr:String):Int{
    var result = 0
    var current = 0
    var operation = '+'
    for(i in expr.indices){
        val c = expr[i]
        if(c == ' ') continue
        if(c.isDigit()) current = current * 10 + c.digitToInt()
        if(!c.isDigit() || i == expr.lastIndex){
            when(operation){
                '+' -> result += current
                '-' -> result -= current
                '*' -> result *= current
                '/' -> result /= current
                else -> error("Не предвиденный символ!")
            }
            operation = c
            current = 0
        }
    }
    return result
}

fun main(){
    print("expr >> ")
    val expr = readln()
    println("Result: ${equation(expr)}")
}