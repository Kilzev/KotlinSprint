package org.example.lesson_2

const val MINUTES_IN_HOUR: Int = 60
const val hoursInDay: Int = 24
fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val minutesTravelTime: Int = 457
    val totalDepartureMinute = departureHour * MINUTES_IN_HOUR + departureMinute
    val totalArrivalMinute = totalDepartureMinute + minutesTravelTime
    val arrivalHour = String.format("%02d", totalArrivalMinute / MINUTES_IN_HOUR % hoursInDay)
    val arrivalMinute = String.format("%02d", totalArrivalMinute % MINUTES_IN_HOUR)
    println("$arrivalHour:$arrivalMinute")
}