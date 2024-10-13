package practice_9

fun main(){
    print("Длина пароля >> ")
    val n = readln().toInt()
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?"
    var pass = ""
    repeat(n){
        pass += chars.random()
    }
    println("Пароль: $pass")
}