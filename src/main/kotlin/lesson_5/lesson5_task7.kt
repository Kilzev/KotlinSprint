package org.example.lesson_5

fun main() {
    println("Введите расстояние поездки в километрах: ")
    val range = readln().toFloat()
    println("Введите расход топлива на 100 км. в литрах: ")
    val consumption = readln().toFloat()
    println("Введите текущую стоимость топлива: ")
    val gasPrice = readln().toFloat()

    val consumptionOneKilometr = consumption / 100
    val gasNeed = range * consumptionOneKilometr
    val finalPrice = String.format("%.2f", gasPrice * gasNeed)

    println("Cтоимость поездки - $finalPrice рублей")


}