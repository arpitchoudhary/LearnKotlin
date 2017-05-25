package com.arpit.`interface`

/**
 * Created by achoudhary on 5/25/17.
 */
/**
 * interface method define
 */
interface Time {

    fun setTime(hours: Int, min: Int = 0, sec: Int = 0)

    fun setTime(time : IndiaTime) = setTime(time.hours) // added after long time, so providing default implementation
    // so, that there wont we compilation error's in all the classes

}

class IndiaTime(){
    val hours: Int = 0
    val min: Int = 0
    val sec: Int = 0
}


/**
 * default implemenatation
 */
class TimeImplementation : Time{


    override fun setTime(hours: Int, min: Int, sec: Int) {
    }

    override fun setTime(time: IndiaTime) {
    }
}

/**
 * new interface, have same method like Time interface
 */
interface NewTime{

    fun setTime(time : IndiaTime)

}


class NewTimeImplementation : Time, NewTime{

    override fun setTime(hours: Int, min: Int, sec: Int) {
    }

    // call the time interface method, check the super key word usage here
    override fun setTime(time: IndiaTime) {
        super<Time>.setTime(time)
    }
}