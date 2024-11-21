package org.example.lesson_5

const val SANTIMETERS_IN_METERS = 100

fun main() {
    println("Введите ваш рост в сантиметрах: ")
    val height = readln().toFloat()
    println("Введите ваш вес в килограммах: ")
    val weight = readln().toFloat()
    val heightInMeters = height / SANTIMETERS_IN_METERS
    val bodyMassIndex = (weight / (heightInMeters * heightInMeters))
    val minNumBodyMassIndex = 18.5f
    val normalNumBodyMassIndex = 25
    val maxNumBodyMassIndex = 30


    if (bodyMassIndex < minNumBodyMassIndex) {
        println("Индекс массы тела - ${String.format("%.2f", bodyMassIndex)}: Недостаточная масса тела")
    } else if (bodyMassIndex >= minNumBodyMassIndex && bodyMassIndex < normalNumBodyMassIndex) {
        println("Индекс массы тела - ${String.format("%.2f", bodyMassIndex)}: Нормальная масса тела")
    } else if (bodyMassIndex >= normalNumBodyMassIndex && bodyMassIndex < maxNumBodyMassIndex) {
        println("Индекс массы тела - ${String.format("%.2f", bodyMassIndex)}: Избыточная масса тела")
    } else {
        println("Индекс массы тела - ${String.format("%.2f", bodyMassIndex)}: Ожирение")
    }


}