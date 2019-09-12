package com.example.kotlintutorial.session7

fun main(args: Array<String>) {

    var animal = Animal("My Lion","Yellow",2000,4000)
    var myPanther = Animal(5000)

}

class Animal(speed: Int){
    init {
        println(speed)
    }

    /*
    Secondary constructors
    The class can also declare secondary constructors, which are prefixed with constructor
    If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
    either directly or indirectly through another secondary constructor(s).
    Delegation to another constructor of the same class is done using the this keyword
     */
    constructor(name: String,color: String,power:Int,speed:Int): this(speed){
        println("$name - $color - $power - $speed")
    }

}