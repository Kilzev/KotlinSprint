package org.example.lesson_2
const val minutesInHour: Int = 60
const val hoursInDay: Int = 24
fun main(){
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val minutesTravelTime: Int = 457
    val totalDepartureMinute = departureHour * minutesInHour + departureMinute
    val totalArrivalMinute = totalDepartureMinute + minutesTravelTime
    val arrivalHour = String.format("%02d",totalArrivalMinute / minutesInHour %hoursInDay)
    val arrivalMinute = String.format("%02d",totalArrivalMinute % minutesInHour)
    println("$arrivalHour:$arrivalMinute")
}