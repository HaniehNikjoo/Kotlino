package com.example.kotlintutorial.session15

fun main() {

    var outerAnimalClass = OuterAnimalClass()
    var nestedLion = OuterAnimalClass.StaticLionClass()
    var innerTiger = OuterAnimalClass().NonStaticTigerClass()

    innerTiger.printAnimalName()

}

class OuterAnimalClass{
    private var animalName : String = "Animal"

    class StaticLionClass{
        fun printAnimalName(){
            // println(animalName)
            //Static classes can not access members of the enclosing class
        }
    }

    inner class NonStaticTigerClass{
        fun printAnimalName(){
             println(animalName)
        }
    }

}