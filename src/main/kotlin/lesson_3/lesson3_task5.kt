package org.example.lesson_3

fun main() {
    var playerMove = "D2-D4;0"
    val parts = playerMove.split("-", ";")
    println(parts[0])
    println(parts[1])
    println(parts[2])
}