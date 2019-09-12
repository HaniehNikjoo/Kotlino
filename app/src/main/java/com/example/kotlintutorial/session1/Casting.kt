package com.example.kotlintutorial.session1

fun main(args: Array<String>) {

    val number: Int = 3
    var castNumber: String=number.toString()
    println(castNumber)

    var weight=54.5
    var castInt: Int=weight.toInt()
    println(castInt)

    //Type Checks
    //We can check whether an object conforms to a given type at runtime by using the is operator or its negated form !is
    var name="hanieh"
    if (name is String) {
        println(name.length)
    }else if (name !is String) { // same as !(obj is String)
        println("Not a String")
    }else {
        print(name.length)
    }

    //Safe (nullable) cast operator(as?)
    val x: String? = weight as? String

    var myComputerX: ComputerX = Nexus() //Up Casting - Automatically occurs
    /*
    Unsafe cast operator(as)
    In this case a crash occurs
     */
    var myNexus: Nexus = ComputerX() as Nexus //Down Casting - Doesn't automatically occurs

}

open class ComputerX{
    var computerName: String = "Nexus"
}

class Nexus: ComputerX(){

}