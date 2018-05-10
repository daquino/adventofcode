package com.example.advent.day2

import java.io.File

fun main(args: Array<String>) {
    var time = System.nanoTime()
    val input = File("src/main/resources/day2/input.txt").readText(Charsets.UTF_8)
    println("Checksum = ${calculateChecksum(input)}")
    println("Took ${System.nanoTime()-time}ns to calculate min max checksum.")
    time = System.nanoTime()
    println("Even checksum = ${calculateChecksum(input, ::calculateEvenlyDivisibleRowValue)}")
    println("Took ${System.nanoTime()-time}ns to calculate evenly divisible checksum.")
}