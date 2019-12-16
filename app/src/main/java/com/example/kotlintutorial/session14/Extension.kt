package com.example.kotlintutorial.session14

fun main() {
    var intArray = ArrayList<Int>()
    intArray.add(5)
    intArray.add(9)
    intArray.add(7)
    intArray.addToNumbers(intArray[0],intArray[1])

}

fun ArrayList<Int>.addToNumbers(number1: Int,number2: Int) : Int{
    var result = number1 + number2
    println(result)
    return result
}