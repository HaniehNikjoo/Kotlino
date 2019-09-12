package com.example.kotlintutorial.session7

fun main(args: Array<String>) {

    //Create object from class
    var myCar: Car = Car()
    println(myCar.speed)
    println(myCar.power)

    var yourcar: Car = Car()
    yourcar.speed=200
    println(yourcar.speed)
    println(myCar.speed)

    println(Car().nmberOfWheels)

}

class Car(){

    //Properties in the class must be initialized
    var speed: Int = 0
    var power: Int = 0
    var name: String = ""
    var nmberOfWheels:Int = 0

}