package org.example.lesson_1

const val secondsInMinute = 60
const val minutesInHour = 60
fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / secondsInMinute / minutesInHour
    val minutes = totalSeconds % (secondsInMinute * minutesInHour) / minutesInHour
    val seconds = totalSeconds % secondsInMinute
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}