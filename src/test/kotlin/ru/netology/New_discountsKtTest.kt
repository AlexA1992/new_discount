package ru.netology

import org.junit.Test

import org.junit.Assert.*

class New_discountsKtTest {

    @Test
    fun main_Maestro_false() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "Maestro"
        val isAction: Boolean = false

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }
}