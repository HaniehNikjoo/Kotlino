package com.example.kotlintutorial.session3

fun main(args: Array<String>) {

    var personAge = 25
    var personWeight = 30

    var result = if(personAge > personWeight) personAge else personWeight
    println("$result")

    var number1 = 100
    var number2 = 50

    var maximumValue = if(number1 == number2) number2 else number1
    println("$maximumValue")

}