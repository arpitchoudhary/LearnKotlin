package com.arpit.higherfunction

/**
 * Created by achoudhary on 5/26/17.
 */

fun main(args: Array<String>) {

    doSomething(action)

    var result = calculateResult(cal)
    print(result)

}

fun calculateResult(function: (Int, Int) -> Int): Int {
    return function(7, 8)
}

/**
 * specifying the type, explicitly
 */
val action: () -> Unit = { println("Hello") }

val cal: (Int, Int) -> Int = { x, y -> x * y }


fun doSomething(func: () -> Unit) {
    func()
}


