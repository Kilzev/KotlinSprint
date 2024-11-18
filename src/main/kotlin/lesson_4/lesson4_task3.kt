package org.example.lesson_4

const val WEATHER_CONDITION_SUNNY = true
const val TENT_OPENED = true
const val AIR_HUMIDITY = 20
const val TIME_OF_YEAR = "не зима"

fun main() {
    val currentWeatherConditionSunny = true
    val currentTentOpened = true
    val currentAirHumidity = 20
    val currentTimeOfYear = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (WEATHER_CONDITION_SUNNY == currentWeatherConditionSunny) and
                    (TENT_OPENED == currentTentOpened) and 
                    (AIR_HUMIDITY == currentAirHumidity) and
                    (TIME_OF_YEAR == currentTimeOfYear)
        }"
    )
}