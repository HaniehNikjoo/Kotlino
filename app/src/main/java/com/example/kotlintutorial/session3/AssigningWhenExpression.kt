package com.example.kotlintutorial.session3

fun main(args: Array<String>) {

    var boxerPunchSpeed = 100

    var isAFastBoxer = when(boxerPunchSpeed){
        200 -> true
        else -> false
    }
    println(isAFastBoxer)
}