package org.example.lesson_5

fun main() {

    val firstWinNum = 11
    val secondWinNum = 27
    println("Введите первое число в диапазоне от о до 42: ")
    val userFirstNum = readln().toInt()
    println("Введите второе число в диапазоне от о до 42: ")
    val userSecondNum = readln().toInt()

    if (userFirstNum == firstWinNum && userSecondNum == secondWinNum) {
        println("Поздравляем! Вы выиграли главный приз! ")
    } else if (userFirstNum == firstWinNum || userSecondNum == secondWinNum) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }
}