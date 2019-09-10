package com.example.kotlintutorial.session6

fun main(args: Array<String>) {

    subtract(10,5)
    subtract(15)
    subtract()
}

/*fun name(arg1 = default value,arg2 = default value..): Unit(hasnt return anything){
 }
*/
fun subtract(firstNumber : Int = 20 ,secondNumber : Int = 5): Unit{
    println(firstNumber - secondNumber)
}