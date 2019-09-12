package com.example.kotlintutorial.session8

fun main(args: Array<String>) {

    var myClass: MyClass = MyClass()
    myClass.doSomething()

}

open class BaseClass{

    fun publicMethod(){
        println("Print publicMethod..")
    }

    private fun privateMethod(){
        println("Print privateMethod..")
    }

    internal fun internalMethod(){
        println("Print internalMethod..")
    }

    protected fun protectedeMethod(){
        println("Print protectedeMethod..")
    }

}

class MyClass: BaseClass(){

    fun doSomething(){
        super.publicMethod()
        super.protectedeMethod()
        super.internalMethod()
        //super.privateMethod()
    }

}