package com.home.playground.storage

interface IntStorage {
    fun add(number: Int)

    fun countUnique(): Long

    fun addAll(other: IntStorage) {
        throw UnsupportedOperationException()
    }
}