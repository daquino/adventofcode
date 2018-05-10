package com.example.advent.day3

import kotlin.math.absoluteValue

fun calculateShortestPathSteps(index: Int): Int {
    val ring = findRing(index)
    val midpoints = findMidpoints(ring)
    val shortestMidpointDistance = calculateShortestMidpointDistance(midpoints, index)
    return ring + shortestMidpointDistance
}

private fun findRing(index: Int): Int {
    return generateSequence(0) { it + 1 }
            .filter { it -> index <= calculateCorner(it) }
            .first()
}

private fun calculateCorner(ring: Int): Int = (2 * ring + 1) * (2 * ring + 1)

private fun findMidpoints(ring: Int): List<Int> {
    val corner = calculateCorner(ring)
    val midpoint1 = corner - ring
    val midpoint2 = midpoint1 - 2 * ring
    val midpoint3 = midpoint2 - 2 * ring
    val midpoint4 = midpoint3 - 2 * ring
    return listOf(midpoint1, midpoint2, midpoint3, midpoint4)
}

private fun calculateShortestMidpointDistance(midpoints: List<Int>, index: Int): Int {
    return midpoints.stream()
            .map { midpoint -> midpoint - index }
            .map { distance -> distance.absoluteValue }
            .min { distance1, distance2 -> distance1.compareTo(distance2) }
            .get()
}


fun main(args: Array<String>) {
    println("Steps = ${calculateShortestPathSteps(312051)}")
}