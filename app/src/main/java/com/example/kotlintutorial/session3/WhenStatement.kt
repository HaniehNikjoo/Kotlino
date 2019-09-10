package com.example.kotlintutorial.session3

fun main(args: Array<String>) {
    /*
    when expression_1
         statement
    when expression_2
         statement
    else
         statement
     */

    var personAge = 80

    when(personAge){
        1 -> { println("The value of personAge variable is $personAge")}
//        20 -> { println("The value of personAge variable is $personAge")}
        20,30 -> { println("The value of personAge variable is $personAge")}
        //Range
        in 10..19-> { println("The value of personAge variable is $personAge")}
        //Range(Except)
        !in 1..100-> { println("The value of personAge variable is $personAge")}
        else -> {println("The else statement is executed")}
    }

}