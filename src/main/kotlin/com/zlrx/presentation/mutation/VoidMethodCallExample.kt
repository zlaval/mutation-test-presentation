package com.zlrx.presentation.mutation

class VoidMethodCallExample {

    private var classField = 10

    private fun incrementConditionally(number: Int) {
        if (number and 1 == 0) {
            classField += number
        }
    }

    fun incrementClassFieldWithEvens(number: Int): Int {
        incrementConditionally(number)
        return classField
    }

}