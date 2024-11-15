package org.example.lesson_2

fun main() {
    val nunOfWorkers: Int = 50
    val workersSalary: Int = 30_000
    val numOfTrainee: Int = 30
    val traineeSalary: Int = 20_000
    val totalWorkersSalary = nunOfWorkers * workersSalary
    val totalSalary = totalWorkersSalary + numOfTrainee * traineeSalary
    val averageSalary = totalSalary / (numOfTrainee + nunOfWorkers)
    println(totalWorkersSalary)
    println(totalSalary)
    println(averageSalary)
}