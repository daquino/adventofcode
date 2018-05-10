package com.example.advent.day1

class CircularCharArray(private val characters: CharArray) {
    val indices
        get() = characters.indices
    val size
        get() = characters.size

    constructor(input: String) : this(input.toCharArray())

    operator fun get(i: Int): Char {
        return if (i < characters.size) {
            characters[i]
        } else {
            val index = i % characters.size
            characters[index]
        }
    }
}