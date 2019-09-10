package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    var partyNames = arrayOf("John","Liza","Mark")

    partyNames[0]="something"
    println(partyNames[0])
    println(partyNames[1])
    println(partyNames[2])
    println()

    var partyList = listOf<String>("Angela","Aaron","Peter")
    println(partyList[2])
    //Immutable
    //partyList[0]="something"
    println()

    //Mutable
    var partyListMutabale = mutableListOf<String>("Guest1","Guest2","Guest3")
    partyListMutabale[0] = "Someone else"
    partyListMutabale.add("Test")
    partyListMutabale.remove("Guest2")

    println(partyListMutabale[0]+" "+partyListMutabale[1]+" "+partyListMutabale[2])

    println()

    var partyArrayList = arrayListOf<String>("A","B","C","D")
    partyArrayList.add("E")
    partyArrayList.remove("D")
    for (myVar in partyArrayList)
        println(myVar)

}