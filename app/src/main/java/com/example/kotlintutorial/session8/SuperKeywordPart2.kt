package com.example.kotlintutorial.session8

fun main(args: Array<String>) {

    var myKickBoxer: KickBoxer=KickBoxer(200,400,10)
    println(myKickBoxer.kickPower)
    println(myKickBoxer.kickSpeed)
    myKickBoxer.fight()

}

open class BoxerX(numberOfMachesWon: Int){
    var name:String = ""
    var punchSpeed: Int =0
    var punchPower: Int =0

    fun throwPunch(){
        println("The boxer is throwing a punch")
    }
}

class KickBoxer: BoxerX {
    var kickSpeed: Int = 0
    var kickPower: Int = 0

    fun fight(){
        super.throwPunch()
        println("The kickboxer is fighting")
    }

    constructor(kickSpeed: Int,kickPower: Int,numberOfMachesWon: Int): super(numberOfMachesWon){
        this.kickSpeed = kickSpeed
        this.kickPower = kickPower
        println(numberOfMachesWon)
    }

}