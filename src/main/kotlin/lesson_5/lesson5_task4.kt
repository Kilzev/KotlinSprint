package org.example.lesson_5

fun main() {
    val existingLogin = "Zaphod"
    val existingPassword = "PanGalactic"
    println("Введите логин: ")
    val userLogin = readln()
    if (existingLogin == userLogin) {
        println("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == existingPassword) {
            println("Добро пожаловать, $userLogin")
        } else {
            println("Доступ запрещен")
        }
    } else {
        println("Необходимо пройти регистрацию")
    }


}