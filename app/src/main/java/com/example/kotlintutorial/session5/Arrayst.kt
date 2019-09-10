package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    //var name = Array<T>(size){defaultValue}
    var partNames = Array<String>(10){"*"}
    partNames[0] = "John"
    println(partNames[0])
    partNames[1] = "Liza"
    println(partNames[1])
    partNames[9] = "Hana"
    println(partNames[9])

    println("------------------")

    for (myVar in partNames){
        println(myVar)
    }

}