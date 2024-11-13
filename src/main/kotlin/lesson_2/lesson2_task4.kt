package org.example.lesson_2

fun main(){
    val crystal: Int = 7
    val iron: Int = 11
    val bonusCoefficient = 0.2f
    val bonusCrystal = (crystal * bonusCoefficient).toInt()
    val bonusIron = (iron * bonusCoefficient).toInt()
    println(bonusCrystal)
    println(bonusIron)
}