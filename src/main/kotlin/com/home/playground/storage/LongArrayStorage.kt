package com.home.playground.storage

class LongArrayStorage : IntStorage {
    companion object {
        private const val VALUE_SIZE = 6
        private const val VALUE_MASK = 0x3F
        private const val STORAGE_SIZE = 1 shl (Int.SIZE_BITS - VALUE_SIZE + 1)
    }

    private val storage = LongArray(STORAGE_SIZE)

    override fun add(number: Int) {
        val index = number ushr VALUE_SIZE
        val value = number and VALUE_MASK
        storage[index] = storage[index] or (1L shl value)
    }

    override fun countUnique(): Long {
        return storage.sumOf { it.countOneBits().toLong() }
    }
}