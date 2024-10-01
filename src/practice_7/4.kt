package practice_7

import kotlin.random.Random

class Card(var price:Int, var suit: Char){
    fun getName():String{
        if((price >= 6) and (price <= 10)) return price.toString()
        return when(price){
            2 -> "Валет"
            3 -> "Дама"
            4 -> "Король"
            else -> "Туз"
        }
    }
}

fun shuffle(deck: Array<Card?>){
    var tmp:Card?
    var index1:Int
    var index2:Int
    repeat(100){
        index1 = Random.nextInt(36)
        do{
            index2 = Random.nextInt(36)
        }while(index1 == index2)
        tmp = deck[index1]
        deck[index1] = deck[index2]
        deck[index2] = tmp
    }
}

fun main(){
    println("21 очко")
    val deck = Array<Card?>(36) {
        Card(
            price = when(it / 4){
                0 -> 2; 1 -> 3; 2 -> 4; 3 -> 6; 4 -> 7; 5 -> 8; 6 -> 9; 7 -> 10; else -> 11
            },
            suit = when(it % 4){
                0 -> '♥'
                1 -> '♣'
                2 -> '♦'
                else -> '♠'
            }
        )
    }
    //игра
    val yourCards = arrayOfNulls<Card>(6)
    val dealerCards = arrayOfNulls<Card>(6)
    //Начало
    while(true) {
        println("------------------------------------------\n>>>Новая игра<<<")
        shuffle(deck)
        var yourI = 0
        var dealerI = 0
        var index = 0
        yourCards[yourI++] = deck[index++]
        dealerCards[dealerI++] = deck[index++]
        //Цикл
        while(true) {
            var sum = 0
            println("------------------------------------------\n|  Ваши карты  |\n------------------------------------------")
            for (i in 0..<yourI) {
                print("${yourCards[i]!!.getName()} ${yourCards[i]!!.suit}${if (i < yourI - 1) ", " else ""}")
                sum += yourCards[i]!!.price
            }
            println("\n>>Cчет $sum")
            if(sum > 21){
                println("У вас $sum - вы проиграли!")
                break
            }
            if(sum == 21){
                println("У вас $sum - вы выиграли!")
                break
            }
            print("* Взять карту (y/n) >> ")
            val choice = readln()
            if (choice == "y") {
                yourCards[yourI++] = deck[index++]
            }
            else{ //Ход дилера
                var dealerSum:Int
                while(true) {
                    dealerSum = 0
                    println("------------------------------------------\n|  Карты дилера  |\n------------------------------------------")
                    for (i in 0..<dealerI) {
                        print("${dealerCards[i]!!.getName()} ${dealerCards[i]!!.suit}${if (i < dealerI - 1) ", " else ""}")
                        dealerSum += dealerCards[i]!!.price
                    }
                    println("\nСчет: $dealerSum")
                    if(dealerI == dealerCards.size) break
                    if(dealerSum <= 16){
                        println("Дилер берет карту\n(Enter)")
                        readln()
                        dealerCards[dealerI++] = deck[index++]
                    }
                    else break
                }
                if(dealerSum == 21)
                    println("Дилер собрал 21 - вы проиграли!")
                else if(dealerSum > 21)
                    println("У дилера $dealerSum - он проиграл!")
                else{
                    println("Дилер отказывается от карты")
                    if(sum > dealerSum)
                        println("У вас больше очков - вы выиграли!")
                    else if(sum == dealerSum)
                        println("У вас с дилером одинаковое число очков - ничья")
                    else
                        println("У вас меньше очков - вы проиграли!")
                }
                break
            }
        }
        print("Продолжить? (y/n) >> ")
        if(readln() != "y") break
    }
    println("Игра окончена")
}