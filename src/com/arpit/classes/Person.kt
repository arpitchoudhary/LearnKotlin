package com.arpit.classes

/**
 * Created by achoudhary on 5/25/17.
 */
open class Person { // adding open here to extend this class

 internal   var firstName : String =  ""
    var LastName : String =  ""

    open fun getName() : String = "$firstName$LastName" // adding open here to override this fun in employee
}

class Employee : Person(){

    override fun getName(): String {
        return super.getName()
    }
}


class Student(name: String){

    override fun toString(): String {
        return "Student()"
    }
}

fun main(args: Array<String>) {

    val emp = Employee()
    emp.LastName = "choudhary"
    println(emp.getName())

    val stud = Student("Arpit")
    println(stud.toString())

}