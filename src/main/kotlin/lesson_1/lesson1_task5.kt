package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS_IN_MINUTE / MINUTES_IN_HOUR
    val minutes = totalSeconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR) / MINUTES_IN_HOUR
    val seconds = totalSeconds % SECONDS_IN_MINUTE
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}