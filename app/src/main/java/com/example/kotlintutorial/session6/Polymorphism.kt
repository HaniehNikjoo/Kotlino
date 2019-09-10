package com.example.kotlintutorial.session6

fun main(args: Array<String>) {

    outPutTheArgument("Something")
    outPutTheArgument(20)
    outPutTheArgument(3.76589)

}

fun outPutTheArgument(stringParameter : String){
    println(stringParameter)
}

fun outPutTheArgument(intParameter : Int){
    println(intParameter)
}

fun outPutTheArgument(doubleParameter : Double){
    println(doubleParameter)
}