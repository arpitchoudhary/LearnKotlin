package com.arpit.higherfunction

/**
 * Created by achoudhary on 5/25/17.
 */
fun main(args: Array<String>) {

    var program = Program()
    var  total = 0
//    program.fibo(8, object :Process{
//        override fun execute(number: Int) {  // old java way
//            println(number)
//        }
//    })

    program.fibo(8, {n -> println(n)})  // one way

    program.fibo(8) {   // one more way to call
        n -> println(n)
    }


    // print total
    program.fibo(8){
      it -> total += it
    }

    println(total)


}


interface Process{

    fun execute(number: Int)
}

class Program {

    fun fibo(limit: Int, action: (Int) -> Unit) {

        var prev = 0
        var current = 1
        var prevPrev = 0

        // 1 1 2 3 5 8
        for (i in 1..limit) {

            action(current)

            var temp = current
            prevPrev = prev
            prev = temp
            current = prev + prevPrev

        }

    }

}