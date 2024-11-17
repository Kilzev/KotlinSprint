package org.example.lesson_3

fun main() {
    var playerMove = "D2-D4;0"
    var startMove = ("${playerMove[0]}${playerMove[1]}")
    var endMove = ("${playerMove[3]}${playerMove[4]}")
    var numOfMove = ("${playerMove[6]}")
    println(startMove)
    println(endMove)
    println(numOfMove)
}