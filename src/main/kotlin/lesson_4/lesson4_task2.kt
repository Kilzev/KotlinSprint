package org.example.lesson_4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_VOLUME = 100

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println(
        "Груз весом $firstCargoWeight кг и" +
                " объемом $firstCargoVolume соответствует категории 'Average':" +
                "${((firstCargoWeight in AVERAGE_MIN_WEIGHT + 1..AVERAGE_MAX_WEIGHT) and (firstCargoVolume < AVERAGE_VOLUME))}"
    )
    println(
        "Груз весом $secondCargoWeight кг и" +
                " объемом $secondCargoVolume соответствует категории 'Average':" +
                "${((secondCargoWeight in AVERAGE_MIN_WEIGHT + 1..AVERAGE_MAX_WEIGHT)and (secondCargoVolume < AVERAGE_VOLUME))}"
    )
}
