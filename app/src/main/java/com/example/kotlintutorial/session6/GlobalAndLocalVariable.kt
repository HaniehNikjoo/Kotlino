package com.example.kotlintutorial.session6

/*Global variable
This variable can be accessed in all functions.
 */
var score = 100

fun main(args: Array<String>) {

    /*Local variable
    This variable can't be accessed in other functions.
     */
    var age = 20
    age = 25
    score = 200
    println(score)

}