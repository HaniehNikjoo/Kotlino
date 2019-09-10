package com.example.kotlintutorial.session6

fun main(args: Array<String>) {

    createANewPost()
    uploadImageToServer()
    downloadImageFromSerer()
}

//Camel Case
fun createANewPost(){
    println("A post is created")
}

fun downloadImageFromSerer(){
    println("Image is downloaded from server")
}

fun uploadImageToServer(){
    println("Image is uploaded to server")
}