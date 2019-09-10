package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    //var name = Array<T>(size){defaultValue}
    var partyNames = Array<String>(10){"*"}
    partyNames[0] = "John"
    println(partyNames[0])
    partyNames[1] = "Liza"
    println(partyNames[1])
    partyNames[9] = "Hana"
    println(partyNames[9])

    println("------------------")

    // ForEach
    for (myVar in partyNames){
        println(myVar)
    }
    // ForEach
    (partyNames).forEach {
        println("TAG:"+it)
    }

    println("All party names by using index")
    partyNames[2] = "A"
    partyNames[3] = "B"
    partyNames[4] = "C"
    partyNames[5] = "D"
    partyNames[6] = "E"
    partyNames[7] = "F"
    partyNames[8] = "G"
    partyNames[9] = "H"

    for (myVar in 0..9)
        println(partyNames[myVar])

    println()
    println("All party names invited by the user")

    for (myVar in 0..9) {
        partyNames[myVar] = readLine()!!
        println(" "+partyNames[myVar]+" is invited to the party.")
    }

}