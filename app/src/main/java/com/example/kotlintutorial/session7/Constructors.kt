package com.example.kotlintutorial.session7

fun main(args: Array<String>) {

    var myBoxer = Boxer("Mark",2000,3000)

}

/* primary constructor
The primary constructor cannot contain any code
 */
class Boxer(name: String,power:Int,speed:Int){
    private var name: String = ""
    private var power: Int? =null
    private var speed: Int = 0

    /*
     Initialization code can be placed in initializer blocks,
     which are prefixed with the init keyword.
     */
    init {
        this.name=name
        println(getName() +" - "+ power +" - "+ speed)
    }

    fun getName():String{
        return this.name
    }

}