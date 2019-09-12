package com.example.kotlintutorial.session9

fun main(args: Array<String>) {

    /*
    . Packages
    There are four visibility modifiers in Kotlin: private, protected, internal and public.
    The default visibility, used if there is no explicit modifier, is public.

     - If you do not specify any visibility modifier, public is used by default,
     which means that your declarations will be visible everywhere;
     - If you mark a declaration private, it will only be visible inside the file containing the declaration;
     - If you mark it internal, it is visible everywhere in the same module;
     - protected is not available for top-level declarations.

    * Note: to use a visible top-level declaration from another package, you should still import it.

    . Classes and Interfaces
    For members declared inside a class:

     - private means visible inside this class only (including all its members);
     - protected — same as private + visible in subclasses too;
     - internal — any client inside this module who sees the declaring class sees its internal members;
     - public — any client who sees the declaring class sees its public members.

    * Note that in Kotlin, outer class does not see private members of its inner classes.
     */

    var myLion:Animal = Animal()
    myLion.animalName = "Some Name"
    var msi = Computer()
    //we can not access beacause the computerName is private
    // msi.computerName = "Some Name"

}

class Animal{
    public var animalName: String = ""
}

class Computer{
    private var computerName: String = ""
}

open class Person{
    protected var personName: String = ""
}

class Student: Person(){

    fun changePersonName(){
        personName="Some Name"
    }

}
