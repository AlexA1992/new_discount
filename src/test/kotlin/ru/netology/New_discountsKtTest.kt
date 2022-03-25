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

    @Test
    fun main_Maestro_true() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "Maestro"
        val isAction: Boolean = true

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_Maestro_true_under_30000() {
        //arrange
        val thisTransfer: Long = 100
        val system: String = "Maestro"
        val isAction: Boolean = true

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_MasterCard_false() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "MasterCard"
        val isAction: Boolean = false

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_MasterCard_true() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "MasterCard"
        val isAction: Boolean = true

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_Visa_false() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "Visa"
        val isAction: Boolean = false

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_Visa_true() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "Visa"
        val isAction: Boolean = true

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_VkPay_false() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "VkPay"
        val isAction: Boolean = false

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_VkPay_true() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "VkPay"
        val isAction: Boolean = true

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_MIR_true() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "МИР"
        val isAction: Boolean = true

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_MIR_false() {
        //arrange
        val thisTransfer: Long = 1000000
        val system: String = "МИР"
        val isAction: Boolean = false

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

    @Test
    fun main_MIR_false_under30000() {
        //arrange
        val thisTransfer: Long = 200
        val system: String = "МИР"
        val isAction: Boolean = false

        //act
        val result = getComission(thisTransfer, system, isAction)
        assertEquals(8000, result);
    }

}