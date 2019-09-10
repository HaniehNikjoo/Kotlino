package com.example.kotlintutorial.session6

fun main(args: Array<String>) {

    /*Calling functions
    name(param1,param2..)
    */
    var myNumber=multiply(2,7)
    println(myNumber)
    println(multiply(3,9))
}

/*fun name(arg1,arg2..): T{
 return T
 }
*/
fun multiply(firstNumber : Int ,secondNumber : Int): Int {
    var result = firstNumber * secondNumber
    return result
}