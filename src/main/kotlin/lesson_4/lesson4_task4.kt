package org.example.lesson_4

fun main() {
    var dayOfTraining = 5
    println(
        """
            Упражнения для рук:${dayOfTraining%2 == 1}
            Упражнения для ног:${dayOfTraining%2 == 0}
            Упражнения для спины:${dayOfTraining%2 == 0}
            Упражнения для пресса:${dayOfTraining%2 == 1}
        """.trimIndent()
    )
}