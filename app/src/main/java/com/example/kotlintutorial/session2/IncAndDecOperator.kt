package com.example.kotlintutorial.session2

fun main(args: Array<String>) {

    var firstNumber : Int = 1

    println(firstNumber)

    firstNumber = firstNumber + 1

    println(firstNumber)

    firstNumber++

    println(firstNumber)

    firstNumber--

    println(firstNumber)

    ++firstNumber

    println(firstNumber)

    --firstNumber

    println(firstNumber)

    var secondNumber : Int = 10
    //postfix operator
    var thirsNumber : Int =secondNumber++
    println(thirsNumber)
    println(secondNumber)

    //prefix operator
    thirsNumber = ++secondNumber
    println(thirsNumber)

}