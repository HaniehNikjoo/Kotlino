package com.example.kotlintutorial.session5

fun main(args: Array<String>) {

    var dictionary = HashMap<String,String>()
    dictionary.put("hello","Salutation")
    dictionary.put("nice","Beautiful")
    dictionary.put("fantastic","Gorgeous")
    dictionary.put("support","Backup")

    println(dictionary["hello"])
    println(dictionary["Hello"])
    println(dictionary["nice"])
    println(dictionary.get("fantastic"))
    println(dictionary.get("support"))

    println("******************************")

    println("All keys:")
    for (key in dictionary.keys){
        println(key)
    }

    println()

    println("All values:")
    for (key in dictionary.values){
        println(key)
    }

    //Updating the HashMap
    println()
    println("Updating dictionary")
    dictionary.put("hello","How are you")
    println(dictionary.get("hello"))

    var myIntStringHashmap = HashMap<Int,String>()
    myIntStringHashmap.put(1,"V")

    var myStringIntHashmap = HashMap<String,Int>()
    myStringIntHashmap.put("K",1)

    println()

    dictionary.remove("nice")
    for (key in dictionary.keys)
        println(key)

    println()

    for (key in dictionary.values)
        println(key)

}