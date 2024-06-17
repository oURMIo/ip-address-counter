package com.home.playground

import com.home.playground.contain.LongArrayContainer
import com.home.playground.converter.IPv4Converter
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.time.Duration
import java.time.Instant
import java.util.stream.Stream

@Suppress("squid:S106")
fun main() {
    val path = Path.of("./src/main/resources/input.txt")

    val startTime = Instant.now()
    println("Start time:$startTime")

    try {
        Files.lines(path, StandardCharsets.US_ASCII).use { ips ->
            println(countUnique(ips))
        }
    } catch (e: IOException) {
        val message = "Error during processing file: $path"
        println(message)
    }

    val finishTime = Instant.now()
    val executionTime = Duration.between(startTime, finishTime).toSeconds()
    println("Finish time:$finishTime")
    println("Execution time:$executionTime")
}

private fun countUnique(ipAddresses: Stream<String>): Long {
    return ipAddresses
        .mapToInt(IPv4Converter())
        .collect(
            { LongArrayContainer() },
            { container, value -> container.add(value) },
            { container1, container2 -> container1.addAll(container2) })
        .countUnique()
}