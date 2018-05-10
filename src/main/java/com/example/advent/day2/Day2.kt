package com.example.advent.day2

fun calculateChecksum(input: String, calculateRowValue: (String) -> Int = ::calculateMaxMinDifferenceValue): Int {
    val rows = input.split("\n")
    var checksum = 0
    for (row in rows) {
        checksum += calculateRowValue(row)
    }
    return checksum
}

fun calculateMaxMinDifferenceValue(row: String): Int {
    var low = -1
    var high = -1
    val numbers = row.split(Regex("\\s"))
    for (index in numbers.indices) {
        val num = Integer.parseInt(numbers[index])
        if (num < low || index == 0) {
            low = num
        }
        if (num > high || index == 0) {
            high = num
        }
    }
    return high - low
}

fun calculateEvenlyDivisibleRowValue(row: String): Int {
    val numbers = row.split(Regex("\\s"))
    var found = false
    var divisor = 0
    var dividend = 0
    for (index in numbers.indices) {
        val num = Integer.parseInt(numbers[index])
        for (index2 in numbers.indices) {
            if (index2 != index) {
                val num2 = Integer.parseInt(numbers[index2])
                if (num % num2 == 0) {
                    divisor = num2
                    dividend = num
                    found = true
                    break
                }
            }
        }
        if (found) {
            break
        }
    }
    return dividend / divisor
}