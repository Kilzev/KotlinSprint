package org.example.lesson_1
const val secondsInMinute = 60
const val minutesInHour = 60
fun main() {
    val totalSeconds = 6480
    val hours = String.format("%02d",totalSeconds /secondsInMinute/minutesInHour)
    val minutes = String.format("%02d",totalSeconds % (secondsInMinute*minutesInHour) / minutesInHour)
    val seconds = String.format("%02d",totalSeconds % secondsInMinute)
    println("$hours:$minutes:$seconds")
}