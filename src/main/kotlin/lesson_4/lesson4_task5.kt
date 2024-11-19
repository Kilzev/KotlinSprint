package org.example.lesson_4

fun main(){
    val sailingAvailable: Boolean
    val damage = readln().toBoolean()
    val currentNumOfSailors = readln().toInt()
    val foodBoxes = readln().toInt()
    val goodWeather = readln().toBoolean()
    val minNumOfSailors = 55
    val recommendedNumOfSailors = 70
    val minNumOfFoodBoxes = 50

    sailingAvailable = (damage == false && currentNumOfSailors in minNumOfSailors..recommendedNumOfSailors && foodBoxes > minNumOfFoodBoxes &&
            (goodWeather == true || goodWeather == false)) ||
            (damage == true && currentNumOfSailors == recommendedNumOfSailors && foodBoxes > minNumOfFoodBoxes && goodWeather == true)

    println(
        "Возможность корабля отправиться в плавание: $sailingAvailable"

    )
}