package com.example.kotlintutorial.session1

fun main(args: Array<String>) {

    println("Please enter the first number: ")
    var firstNumber : Int= readLine()!!.toInt()

    println("Please enter the second number: ")
    var secondNumber : Int= readLine()!!.toInt()

    var multiplication = firstNumber * secondNumber

    var total = firstNumber + secondNumber

    var subtraction = firstNumber - secondNumber

    var division = firstNumber / secondNumber

    var div = firstNumber % secondNumber

    println("Multiplication :$multiplication")
    println("Total :$total")
    println("Subtraction :$subtraction")
    println("Division :$division")
    print("Div :$div")

}