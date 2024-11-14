package org.example.lesson_2

fun main() {
    val crystal: Int = 7
    val iron: Int = 11
    val bonusCoefficient: Int = 20
    val bonusCrystal = (crystal * bonusCoefficient / 100)
    val bonusIron = (iron * bonusCoefficient / 100)
    println(bonusCrystal)
    println(bonusIron)
}