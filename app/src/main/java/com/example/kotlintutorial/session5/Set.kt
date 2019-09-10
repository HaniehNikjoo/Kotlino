package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    // that does not support duplicate elements
    var animalNames = setOf<String>("Lion","Panther","Cat","Tiger","Lion")
    //Immutable
    //animalNames.add("Fish")
    for (animalName in animalNames){
        println(animalName)
    }
    println()

    //Mutable
    var mutableAnimalNames = mutableSetOf<String>("Lion","Panther","Cat","Tiger","Lion")
    mutableAnimalNames.add("Fish")
    for (animalName in mutableAnimalNames){
        println(animalName)
    }

}