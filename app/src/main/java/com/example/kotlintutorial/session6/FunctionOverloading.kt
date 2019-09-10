package com.example.kotlintutorial.session6

fun main(args: Array<String>) {

    println(add(2,5))
    println(add(2,2,1,7))
    println(add(2,5,4))
    println(add(1,1,1,1,1,1,1))

}

//Function overloading means the ability to define more than one function with the same name
fun add(firstNumber : Int,secondNumber : Int){
    println(firstNumber + secondNumber)
}

fun add(firstNumber : Int,secondNumber : Int , thirdNumber : Int){
    println(firstNumber + secondNumber + thirdNumber)
}

fun add(firstNumber : Int,secondNumber : Int , thirdNumber : Int , fourthNumber : Int){
    println(firstNumber + secondNumber + thirdNumber + fourthNumber)
}

fun add(firstNumber : Int,secondNumber : Int , thirdNumber : Int , fourthNumber : Int , fifthNumber : Int){
    println(firstNumber + secondNumber + thirdNumber + fifthNumber)
}

fun add(firstNumber : Int,secondNumber : Int , thirdNumber : Int , fourthNumber : Int , fifthNumber : Int , sixthNumber : Int ,
        seventhNumber : Int){
    println(firstNumber + secondNumber + thirdNumber + fifthNumber + sixthNumber + seventhNumber)
}
