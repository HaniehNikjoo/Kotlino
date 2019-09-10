package com.example.kotlintutorial.session4

fun main(args: Array<String>) {

    for(myNumber in 1..10)
        println("num - $myNumber")

    // For loop
    for (i in 0..10) {
        println(i)
    }
    // ForEach
    (0..10).forEach {
        println(it)
    }
}