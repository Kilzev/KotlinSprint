package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val clientDeposit: Double = 70_000.0
    val interestRate: Double = 0.167
    val investYears: Int = 20
    val profit: String = String.format("%.3f", clientDeposit * ((1 + interestRate).pow(investYears)))
    println(profit)
}