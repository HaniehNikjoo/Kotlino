package com.example.kotlintutorial.session10

fun main(args: Array<String>) {

    var myNexus = NexusClass()
    println(myNexus.getName()+" - "+myNexus.getRam()+" - "+myNexus.getCpuType())

    var myIphone = IPhoneClass()
    println(myIphone.getName()+" - "+myIphone.getRam()+" - "+myIphone.getCpuType())

}

interface ComputerInterface{
    fun getName(): String
    fun getRam():Int
    fun getCpuType():String
}

//Multiple classes can implement this interface
class NexusClass: ComputerInterface {
    override fun getName(): String {
        //To change body of created functions use File | Settings | File Templates.
        return "Nexus 6"
    }

    override fun getRam(): Int {
        return 1000
    }

    override fun getCpuType(): String {
        return "Snapdragon"
    }
}

class IPhoneClass: ComputerInterface {
    override fun getName(): String {
        return "iPhone 7"
    }

    override fun getRam(): Int {
        return 3000
    }

    override fun getCpuType(): String {
        return "A5"
    }

}