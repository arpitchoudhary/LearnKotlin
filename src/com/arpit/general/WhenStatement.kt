package com.arpit.general

/**
 * Created by achoudhary on 5/24/17.
 */
fun main(arrgs: Array<String>) {

    var question = Question()

    question.answer = 26 // this is the answer we got, lets match with the correct Answer using when


    when (question.answer == question.correctAnswer) {

        true ->
            println("you'r answer is correct")
        false ->
            println("sorry you'r answer is incorrect")

    }

    // reset answer with the wrong one this time
    question.answer = 21
    question.getResult()


}


class Question {

    val correctAnswer = 26

    val question = "how many alphabet are their english?"

    var answer: Int? = null

    /**
     * method using when
     */
    fun getResult() {
        when (answer) {
            correctAnswer -> println("Correct Ans")
            else -> println("In-Correct Ans")
        }

    }


}