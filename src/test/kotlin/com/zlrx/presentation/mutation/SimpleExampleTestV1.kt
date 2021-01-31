package com.zlrx.presentation.mutation

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SimpleExampleTestV1 {

    val ut = SimpleExampleV1()

    @Test
    fun `positive number should return true`() {
        val number = 1
        val result = ut.nonNegative(number)
        assertTrue(result)
    }

    @Test
    fun `negative number should return false`() {
        val number = -1
        val result = ut.nonNegative(number)
        assertFalse(result)
    }

}