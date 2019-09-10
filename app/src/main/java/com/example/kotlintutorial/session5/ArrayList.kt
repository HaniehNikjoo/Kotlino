package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    //var name : ArrayList<T> = ArrayList(Initial Capacity)
    var partyList : ArrayList<String> = ArrayList()
    partyList.add("John")
    partyList.add("Vanessa")
    partyList.add("Liza")
    partyList.add("Leila")
    partyList.add("Mark")

    println("The first person invited to the part: "+partyList.get(0))
    println("The second person invited to the part: "+partyList.get(1))
    println("The third person invited to the part: "+partyList.get(2))
    println("The fourth person invited to the part: "+partyList.get(3))
    println("The final person invited to the part: "+partyList.get(4))

    println("******************************")

    for (name in partyList)
        println(name)

    println("******************************")

    partyList.set(3,"Aaron")

    println(partyList.get(3))

    println("******************************")

    println("All names:")

    for (name in partyList)
        println(name)

    println("******************************")

    //Case Sensitive
    if (partyList.contains("Max"))
        println("Wow.Max is also invited")
    else
        println("Sorry.Max is not invited")

    println("******************************")

    println("Party List by Index:" )
    for (index in 0..partyList.size-1){ //0 1 2 3 4
        println(partyList[index])
    }

    println("******************************")

    partyList.remove("Mark")
    for (index in 0..partyList.size-1){
        println(partyList[index])
    }

    println("******************************")

    partyList.removeAt(1)
    for (index in 0..partyList.size-1){
        println(partyList[index])
    }

}