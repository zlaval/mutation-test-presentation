package com.zlrx.presentation.mutation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class VoidMethodCallExampleTest {

    lateinit var ut: VoidMethodCallExample

    @BeforeEach
    fun init() {
        ut = VoidMethodCallExample()
    }

    //@Test
    fun `should not increment the number if odd passed`() {
        val even = 5

        val result = ut.incrementClassFieldWithEvens(even)

        assertEquals(10, result)
    }


    @Test
    fun `should increment the number if even passed`() {
        val even = 4

        val result = ut.incrementClassFieldWithEvens(even)

        assertEquals(14, result)//
    }


}