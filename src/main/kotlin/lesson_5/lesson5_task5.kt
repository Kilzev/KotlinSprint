package org.example.lesson_5

fun main() {
    val jackPot = 3
    val hugePrize = 2
    val consolationPrize = 1
    val numbers = listOf((0..42).random(), (0..42).random(), (0..42).random())
    println("Введите числа: ")
    val userNumbers = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val common = numbers.intersect(userNumbers).count()
    if (common == jackPot) {
        println("Вы выиграли джекпот!")
    } else if (common == hugePrize) {
        println("Вы выиграли крупный приз!")
    } else if (common == consolationPrize) {println("Вы выиграли утешительный приз")
    }
    else{println("Вы не угадали ни одного числа")}
}