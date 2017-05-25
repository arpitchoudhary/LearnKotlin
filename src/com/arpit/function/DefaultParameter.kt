package com.arpit.function

/**
 * Created by achoudhary on 5/25/17.
 */
fun main(args: Array<String>) {

    setFullName("Arpit ", " Choudhary ")
}

/**
 * this is the example of default function, remember middleName is the last parameter,
 * if you move its position you will get an error
 */
fun setFullName(firstName: String, lastName: String, middleName: String = "") {
    print(firstName + middleName + lastName)
}

/**
 * if you want to do something list this then used name parameter
 */
//fun setFullName(firstName: String, middleName: String = "", lastName: String) {
//
//}