package com.example.advent.day3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3Test {
    @Test
    fun testStartIndex() {
        val steps = calculateShortestPathSteps(1)
        Assertions.assertEquals(0, steps)
    }

    @Test
    fun testIndex12() {
        val steps = calculateShortestPathSteps(12)
        Assertions.assertEquals(3, steps)
    }

    @Test
    fun testIndex23() {
        val steps = calculateShortestPathSteps(23)
        Assertions.assertEquals(2, steps)
    }

    @Test
    fun testIndex1024() {
        val steps = calculateShortestPathSteps(1024)
        Assertions.assertEquals(31, steps)
    }
}