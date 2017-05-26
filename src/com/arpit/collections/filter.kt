package com.arpit.collections

/**
 * Created by achoudhary on 5/25/17.
 */
fun main(args: Array<String>) {

    val ints = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // print the even number
    var evenNumbers = ints.filter {
        it % 2 == 0
    }

    println(evenNumbers)

    // square the number

    var square = ints.map { it * it }
    println(square)

    // combine both operation

    var squareOfEvenNum = ints.
            filter { it % 2 == 0 }
            .map { it * it }

    println(squareOfEvenNum)


    // list of students
    var students = listOf<Student>(Student(1, "Arpit"), Student(2, "Vilas"), Student(3, "Abhi"))

    // lets gets the student whose name starts with A
    var nameWithA = students
            .filter { it -> it.name.startsWith("A") }
            .map { it -> it.name }

    println(nameWithA)


    // lets use sequence to be efficient

    var nameWithSeq = students
            .asSequence()
            .filter { it -> it.name.startsWith("A") }
            .map { it -> it.name }

    println(nameWithSeq)

}


class Student(val id: Int, val name: String) {

}