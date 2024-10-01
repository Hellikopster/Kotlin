package practice_7

fun calculate(victories:Int, draws:Int, defeats:Int){
    println("Очки: ${3 * victories + draws}")
}

fun main(){
    print("Число побед >> ")
    val victories = readln().toInt()
    print("Число ничейных >> ")
    val draws = readln().toInt()
    print("Число поражений >> ")
    val defeats = readln().toInt()
    calculate(victories, draws, defeats)
}