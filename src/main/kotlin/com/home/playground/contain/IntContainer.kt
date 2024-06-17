package com.home.playground.contain

interface IntContainer {
    fun add(number: Int)

    fun countUnique(): Long

    fun addAll(other: IntContainer) {
        throw UnsupportedOperationException()
    }
}