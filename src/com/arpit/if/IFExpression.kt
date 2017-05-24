package com.arpit.`if`


/**
 * Created by achoudhary on 5/24/17.
 */
fun main(args: Array<String>) {

    var arpit = Person("Arpit", 26, "Bijnore")
    var sunil = Person("Sunil", 27, "Delhi")

    /**
     * using if as a expression and assigning the result back to the message var.
     */
    var message = if (arpit.placeOfBirth == "Bijnore")
        "He might be Arpit"
    else
        "He might be Sunil"

    print(message)
}


/**
 * might not be the best way to showcase the if expression usage
 */
class Person(var name : String , var age: Int, val placeOfBirth: String) {
}