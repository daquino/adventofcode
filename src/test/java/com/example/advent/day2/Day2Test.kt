package com.example.advent.day2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day2Test {
    @Test
    fun testSimpleChecksum() {
        val input = File("src/test/resources/day2/sample_input.txt").readText(Charsets.UTF_8)
        val checksum = calculateChecksum(input)
        Assertions.assertEquals(18, checksum)
    }

    @Test
    fun testEvenlyDivisibleChecksum() {
        val input = File("src/test/resources/day2/sample_input2.txt").readText(Charsets.UTF_8)
        val checksum = calculateChecksum(input, ::calculateEvenlyDivisibleRowValue)
        Assertions.assertEquals(9, checksum)
    }
}