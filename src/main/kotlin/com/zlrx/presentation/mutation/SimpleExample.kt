package com.zlrx.presentation.mutation

class SimpleExample {


    fun nonNegative(number: Int): Boolean {
        if (number >= 0) {
            return true
        } else {
            return false
        }
    }

    /*
    fun nonNegativeV2(number: Int): Boolean {
        return number >= 0
    }

    fun nonNegativeV3(number: Int): Boolean {
        if (number > 0) {
            return true
        } else if (number == 0) {
            return true
        } else {
            return false
        }
    }
*/
}