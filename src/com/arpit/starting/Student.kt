package com.arpit

/**
 * Created by achoudhary on 5/24/17.
 */
class Student {

    /**
     * check the difference between var (mutable) and val (immutable)
     */
    var name: String = "" // can assign new string to name

    val human: Boolean = true // can't assign new value to this variable act as a final.,  weird name :)

    // simple function
    fun displayName(): Unit { // unit is equivalent to void in java

        println("Name is $name")

    }

    // use lamda, passing function as a parameter
    fun displayNameWithLamda(function: (s: String) -> Unit) {
        function(name)
    }
}