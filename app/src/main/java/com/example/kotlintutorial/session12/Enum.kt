package com.example.kotlintutorial.session12

fun main(args: Array<String>) {

    println(GameStatus.WON)
    println(Feel.GOOD)

}

enum class GameStatus{
    WON,LOSS
}

enum class Feel{
    GOOD,BAD
}