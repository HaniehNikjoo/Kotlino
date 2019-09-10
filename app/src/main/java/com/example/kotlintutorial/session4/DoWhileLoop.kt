package com.example.kotlintutorial.session4

fun main(args: Array<String>) {

//    var peopleAreFriendly : Boolean = true
    var peopleAreFriendly : Boolean = false
    var counter = 0

    do {
        println("Talk to people")
        counter++

    }while (peopleAreFriendly && counter < 5)

}