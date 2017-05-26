package com.arpit.higherfunction

/**
 * Created by achoudhary on 5/26/17.
 */
fun main(args: Array<String>) {

    var listOfInts = listOf<Int>(1, 2, 4, 3, 5, 6, 7)

    println(pickNumber(listOfInts, { it -> it == 3 }))

}


inline fun <T> pickNumber(items: List<T>, predicate: (T) -> Boolean): T {

    for (item in items) {
        if (predicate(item)) return item
    }
    throw Exception()

}