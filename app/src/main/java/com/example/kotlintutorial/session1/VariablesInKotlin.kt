package com.example.kotlintutorial.session1

//An entry point of a Kotlin application is the main function.
fun main(args: Array<String>) {

    //Read-only local variables are defined using the keyword val. They can be assigned a value only once.(constant)
    val myConstant="fixed value"

    // Type required when no initializer is provided
    val number: Int
    /* deferred assignment
    val cannot be reassigned */
    number = 3

    //this specific variable or constatnt can not accept value null
    val family: String
    //family=null
    family="raeisi"

    //this specific variable or constatnt can accept value null
    val tell: Int?
    tell=null
    var height: Int?
    height=null
    //Null Safety
    var myIntegerNumber : Int? = 123
    println(myIntegerNumber!!)
    // var myIntegerNumber2 : Int? = null
    // println(myIntegerNumber2!!)

    //Declaring variables(when you won’t need to specify the type)
    var name="hanieh"
    name="another name"
    var age=20
    var weight=54.5

    var score=20
    /* you can concatenate using the + operator
    Prints the given message and the line separator to the standard output stream.*/
    println("Your score is:"+score)
    /*or
    Prints the given message to the standard output stream.*/
    print("Your score is:$score")

    //Prints the line separator to the standard output stream.
    println()

    print("Enter your cellphone:")
    //Reads a line of input from the standard input stream.
    var cellphone= readLine()
    println("This the cellphone:"+cellphone)

    println(name)
    println(myConstant)
    println(age)
    println(weight)
    println(number)
    println(family)
    println(tell)
    println(height)

    //We can check whether an object conforms to a given type at runtime by using the is operator or its negated form !is
    if (name is String) {
        println(name.length)
    }else if (name !is String) { // same as !(obj is String)
        println("Not a String")
    }else {
        print(name.length)
    }

}