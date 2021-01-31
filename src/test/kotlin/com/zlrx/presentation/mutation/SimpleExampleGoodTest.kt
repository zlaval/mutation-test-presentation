package com.zlrx.presentation.mutation

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

@Disabled
class SimpleExampleGoodTest {


    val ut = SimpleExample()

    @Test
    fun `should return true using positive number`() {
        val number = 1

        val result = ut.nonNegative(number)

        Assertions.assertTrue(result)
    }

    @Test
    fun `should return false using negative number`() {
        val number = -1

        val result = ut.nonNegative(number)

        Assertions.assertFalse(result)
    }

    @Test
    fun `should return true using zero`() {
        val number = 0

        val result = ut.nonNegative(number)

        Assertions.assertTrue(result)
    }

}