package com.example.kotlintutorial.session4

fun main(args: Array<String>) {

    for(myNumber in 1..5) {
        println("$myNumber . OutSideForLoop")
        for (mySecondNumber in 1..3)
            println("$mySecondNumber - InSideForLoop")
    }

}