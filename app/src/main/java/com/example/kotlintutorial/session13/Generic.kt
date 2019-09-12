package com.example.kotlintutorial.session13

fun main(args: Array<String>) {

    var myAnima = GenericAnimalClass("Lion")
    println(myAnima)

}

class GenericAnimalClass<T>(kind: T){

    init {
        println(kind)
    }

}