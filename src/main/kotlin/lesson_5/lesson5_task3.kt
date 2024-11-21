package org.example.lesson_5

fun main() {

    val firstWinNum = 11
    val secondWinNum = 27
    println("Введите первое число в диапазоне от о до 42: ")
    val userFirstNum = readln().toInt()
    println("Введите второе число в диапазоне от о до 42: ")
    val userSecondNum = readln().toInt()

    if ((userFirstNum == firstWinNum || userFirstNum == secondWinNum)
        && (userSecondNum == secondWinNum || userSecondNum == firstWinNum)
    ) {
        println("Поздравляем! Вы выиграли главный приз! ")
    } else if ((userFirstNum == firstWinNum || userFirstNum == secondWinNum)
        || (userSecondNum == secondWinNum || userSecondNum == firstWinNum)
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }
}