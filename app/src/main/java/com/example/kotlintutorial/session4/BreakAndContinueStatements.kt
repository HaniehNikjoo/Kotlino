package com.example.kotlintutorial.session4

fun main(args: Array<String>) {

    for (myNumber in 1..10){
        if(myNumber == 4)
            break
        println("$myNumber - Welcome")
    }
    for (myNumber in 1..10){
        if(myNumber == 4)
            continue
        println("$myNumber - Hi")
    }

}