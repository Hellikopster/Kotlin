package practice_9

import kotlin.random.Random

fun main(){
    do{
        var loop = true
        println("Угадай число от 1 до 100 (-1 для выхода)")
        val num = Random.nextInt(1, 101)
        while(true){
            print(">> ")
            val your = readln().toInt()
            if(your == -1){
                loop = false
                break
            }
            else if(your > num) println("Ваше число больше")
            else if(your < num) println("Ваше число меньше")
            else {
                println("Вы угадали!")
                break
            }
        }
    }while(loop)
}