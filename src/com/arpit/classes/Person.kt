package com.arpit.classes

/**
 * Created by achoudhary on 5/25/17.
 */
open class Person { // adding open here to extend this class

 internal   var firstName : String =  ""
    var LastName : String =  ""

    open fun getName() : String = "$firstName  $LastName" // adding open here to override this fun in employee
}

class Employee : Person(){

    override fun getName(): String {
        return super.getName()
    }
}

fun main(args: Array<String>) {

    val emp = Employee()
    emp.LastName = "choudhary"

    print(emp.getName())

}