package com.example.advent.day1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day1Test {
    @Test
    fun testSimple() {
        val captcha = solveCaptcha("1122")
        Assertions.assertEquals(3, captcha)
    }

    @Test
    fun testAllSameDigits() {
        val captcha = solveCaptcha("1111")
        Assertions.assertEquals(4, captcha)
    }

    @Test
    fun testComplexDigits() {
        val captcha = solveCaptcha("91212129")
        Assertions.assertEquals(9, captcha)
    }

    @Test
    fun testHalfwayAlternating() {
        val total = solveHalfwayCaptcha("1212")
        Assertions.assertEquals(6, total)
    }

    @Test
    fun testHalfwayNonMatching() {
        val total = solveHalfwayCaptcha("1221")
        Assertions.assertEquals(0, total)
    }

    @Test
    fun testHalfwaySingleMatch() {
        val total = solveHalfwayCaptcha("123425")
        Assertions.assertEquals(4, total)
    }

    @Test
    fun testHalfwayMatchingThreeDigitSequence() {
        val total = solveHalfwayCaptcha("123123")
        Assertions.assertEquals(12, total)
    }

    @Test
    fun testHalfwayMatchingComplex() {
        val total = solveHalfwayCaptcha("12131415")
        Assertions.assertEquals(4, total)
    }




}