package com.example.kotlintutorial.session8

fun main(args: Array<String>) {

    var myPerson= Person()
    println(myPerson.name)

    myPerson.name="Aaron"
    println(myPerson.name)

    var myStudent= Student()
    myStudent.name="Mark"
    myStudent.studentId=12345
    println(myStudent.name)
    println(myPerson.name)
    //The studentId is an optional variable and we have to make sure about that is going to be a valid value
    println(myStudent.studentId!!)

}

/*
To allow child classes to override a property of a parent class,
you must annotate it with the open modifier.
 */
open class Person(){
    var name: String ? = null
    var age: Int ? = null
    var height: Int ? = null
}

class Student: Person(){
    var studentId: Int ? = null
}

class Employee: Person(){
    var employeeId: Int ? = null
}

