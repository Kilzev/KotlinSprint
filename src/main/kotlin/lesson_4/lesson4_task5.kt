package org.example.lesson_4

fun main(){
    val sailingAvailable: Boolean
    val damage = readln().toBoolean()
    val currentNumOfSailors = readln().toInt()
    val foodBoxes = readln().toInt()
    val goodWeather = readln().toBoolean()

    sailingAvailable = (damage == false && currentNumOfSailors in 55..70 && foodBoxes > 50 &&
            (goodWeather == true or goodWeather == false)) or
            (damage == true && currentNumOfSailors == 70 && foodBoxes > 50 && goodWeather == true)

    println(
        "Возможность корабля отправиться в плавание: $sailingAvailable"

    )
}