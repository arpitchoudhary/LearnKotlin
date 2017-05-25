package com.arpit.function

/**
 * Created by achoudhary on 5/25/17.
 */
fun main(args: Array<String>) {

    val c = Calculator("StringA")
    val c1 = Calculator("StringB")

    val c2 = c Addition c1
    println(c2)

    val c3 = c2 + c
    print(c3)

}


/**
 *
 * Addition on String = String A, String B -> StringAStringB
 *
 * I will also show the operator overloading here
 *
 * String A + StringB -> StringAStringB
 *
 */
class Calculator(var input: String) {

    override fun toString(): String {
        return "Calculator(input='$input')"
    }
}

/**
 *  addition of string
 */
infix fun Calculator.Addition(passValue: Calculator): Calculator {
    return Calculator(this.input + passValue.input)
}

/**
 *  example of operator overloading
 */
operator infix fun Calculator.plus(passValue: Calculator): Calculator {
    return Calculator(this.input + passValue.input)
}

