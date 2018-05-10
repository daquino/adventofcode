package com.example.advent.day1

fun solveCaptcha(input: String): Int {
    val characters = CircularCharArray(input)
    var total = 0
    for (i in characters.indices) {
        val current = characters[i]
        val next = characters[i + 1]
        if (current == next) {
            total += Character.getNumericValue(current)
        }
    }

    return total
}

fun solveHalfwayCaptcha(input: String): Int {
    val characters = CircularCharArray(input)
    val shift = characters.size / 2
    var total = 0
    for (i in characters.indices) {
        val current = characters[i]
        val next = characters[i + shift]
        if (current == next) {
            total += Character.getNumericValue(current)
        }
    }
    return total
}