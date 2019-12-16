package com.example.kotlintutorial.session16

fun main() {

    var mySamsungGalaxy = SamsungGalaxy.theOnlyGalaxyNote9Instance
    mySamsungGalaxy.name="Galaxy Note10"
    println(mySamsungGalaxy.name)

    var yourSamsungGalaxy = SamsungGalaxy.theOnlyGalaxyNote9Instance
    println(yourSamsungGalaxy.name)

}

class SamsungGalaxy{
    var name : String = "Galaxy Note9"

    constructor(){
       println("$name is created")
    }
    companion object{
        val theOnlyGalaxyNote9Instance : SamsungGalaxy by lazy { SamsungGalaxy() }
        //Every time this instance is sent back
        //This instance is created only once
    }
}