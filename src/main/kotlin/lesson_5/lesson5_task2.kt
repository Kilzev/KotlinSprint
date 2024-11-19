package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2024
    println("Введите год рождения:")
    val birthYear = readln().toInt()
    if ((currentYear - birthYear) >= AGE_OF_MAJORITY) {
        println("Показать скрытый контент")
    } else {
        println("Вернуться на главный экран")
    }
}