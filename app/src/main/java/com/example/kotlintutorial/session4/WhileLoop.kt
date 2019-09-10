package com.example.kotlintutorial.session4

fun main(args: Array<String>) {

    var haveMoney : Boolean = true
    var counter = 0
    while (counter < 5 && haveMoney){
        println("Keep Spending")
        counter++
    }
}