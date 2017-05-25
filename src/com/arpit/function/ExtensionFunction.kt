package com.arpit.function

/**
 * Created by achoudhary on 5/25/17.
 */
fun main(args: Array<String>) {

    val input = "This     Sentence  \t has     unwanted \t\t space"

    // first print the input
    println(input)

    // pass the input to the extension function
    var result = input.removeWhiteSpacesBetweenWordsEX()

    // print the result now
    print(result)

}

/**
 * writing a extension function to the class String,
 * now if you use it, you feels like its inbuilt function of the String class
 */
fun String.removeWhiteSpacesBetweenWordsEX() : String{
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}
