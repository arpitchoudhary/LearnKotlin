package com.arpit

/**
 * Created by achoudhary on 5/24/17.
 */
/**
 * This is the main function similar to that one of main function is Java.
 * Starting point
 */
fun main(args: Array<String>) {

    println("This is the first hello world")

    val arpit = Student()
    //  arpit.human = false -> see the compilation error here

    arpit.name = "Arpit"
    println("Name of the Student is ${arpit.name}") // just ran it then

    // reassign the name
    arpit.name = "Rahul"
    println("Name of the Student is ${arpit.name}") // just ran it then

    // lets call the function from the student class
    arpit.displayName()

    // change the name first
    arpit.name = "siddhant"

    // lets call the lamda function
    arpit.displayNameWithLamda(:: printName)

    println("${arpit.human}")

}

fun printName(s: String): Unit {
    println(s)
}

