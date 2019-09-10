package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    var animalNames = setOf<String>("Lion","Panther","Cat","Tiger","Lion")
    //Immutable
    //animalNames.add("Fish")
    for (animalName in animalNames){
        println(animalName)
    }
    println()

    var mutableAnimalNames = mutableSetOf<String>("Lion","Panther","Cat","Tiger","Lion")
    mutableAnimalNames.add("Fish")
    for (animalName in mutableAnimalNames){
        println(animalName)
    }

}