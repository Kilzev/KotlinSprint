package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9
    println("Доступность столиков на сегодня:${TOTAL_TABLES > bookedToday}")
    println("Доступность столиков на завтра:${TOTAL_TABLES > bookedTomorrow}")
}