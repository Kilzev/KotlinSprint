package org.example.lesson_5

fun main() {
    val numFirst = (0..10).random()
    val numSecond = (0..10).random()
    val correctAnswer = numFirst + numSecond

    println("Сложите числа $numFirst и $numSecond. Ваш ответ:")

    val userAnswer = readln().toInt()
    if (correctAnswer == userAnswer) {
        println("Доступ разрешен")
    } else {
        println("Доступ запрещен")
    }

}