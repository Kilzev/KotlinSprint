package org.example.lesson_2

const val PERCENTAGES = 100

fun main() {
    val crystal: Int = 7
    val iron: Int = 11
    val bonusCoefficient: Int = 20

    val bonusCrystal = (crystal * bonusCoefficient / PERCENTAGES)
    val bonusIron = (iron * bonusCoefficient / PERCENTAGES)

    println(bonusCrystal)
    println(bonusIron)
}