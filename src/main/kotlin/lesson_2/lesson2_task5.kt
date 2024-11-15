package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val clientDeposit: Double = 70_000.0
    val interestRate: Double = 16.7
    val investYears: Int = 20
    val profit: Double = clientDeposit * ((1 + interestRate / 100).pow(investYears))
    println("%.3f".format(profit))

}