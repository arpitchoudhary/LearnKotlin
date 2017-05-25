package com.arpit.function

/**
 * Created by achoudhary on 5/25/17.
 */
fun main(args: Array<String>) {

    // FullName("Arpit", "choudhary") compiler is not happy asking to pass middle name as well

    FullName(firstName = "Arpit", lastName = "Choudhary") // compiler happy now
}

/**
 * this is the example of Named Parameter
 */
fun FullName(firstName: String, middleName: String = "", lastName: String) {

    print(firstName + middleName + lastName)

}
