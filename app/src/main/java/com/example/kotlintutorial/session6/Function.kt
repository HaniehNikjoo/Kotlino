package com.example.kotlintutorial.session6

fun main(args: Array<String>) {

    /*Calling functions
       name()
       */
    createANewPost()
    uploadImageToServer()
    downloadImageFromSerer()
}

/*fun name(arg1,arg2..){
 }
*/
fun createANewPost(){//Camel Case
    println("A post is created")
}

fun downloadImageFromSerer(){
    println("Image is downloaded from server")
}

fun uploadImageToServer(){
    println("Image is uploaded to server")
}