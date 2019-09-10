package com.example.kotlintutorial.session3

fun main(args: Array<String>) {
    /* if (condition) {
       statement
    }else if (condition) {{
       statement
    }else{
       statement
    }
    */

    var score = 12
    if(score > 300)
        println("Great score")
    else if (score > 150)
        println("Excellent score")
    else if (score < 10)
        println("Bad score!")
    else
        println("Failed")

}