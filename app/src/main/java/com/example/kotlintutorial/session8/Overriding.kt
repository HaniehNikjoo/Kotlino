package com.example.kotlintutorial.session8

fun main(args: Array<String>) {

    var myAnimal= AnimalX()
    myAnimal.fight()

    var myLion= Lion()
    myLion.fight()

    var myTiger= Tiger()
    myTiger.fight()

}

open class AnimalX{
    open fun fight(){
        println("Fight harder...")
    }
}

class Tiger: AnimalX(){
    override fun fight() {
        super.fight()
    }
}

class Lion:AnimalX(){
    override fun fight() {
//        super.fight()
        println("The animal is fighting")
    }
}