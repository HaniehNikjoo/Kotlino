package com.example.kotlintutorial.session17

fun main() {
    println("Please enter an INTEGER VALUE")
    try {
        var myIntegerValue : Int = readLine()!!.toInt()
        println(myIntegerValue)
    }catch (myException : Exception){
//        myException.printStackTrace()
        println(myException.message)
    }
}