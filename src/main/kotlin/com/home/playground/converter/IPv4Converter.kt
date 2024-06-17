package com.home.playground.converter

import java.util.function.ToIntFunction

class IPv4Converter : ToIntFunction<CharSequence> {
    override fun applyAsInt(ipAddress: CharSequence): Int {
        var base: Long = 0
        var part: Long = 0

        for (i in ipAddress.indices) {
            val symbol = ipAddress[i]
            if (symbol == '.') {
                base = (base shl Byte.SIZE_BITS) or part
                part = 0
            } else {
                part = part * DECIMAL_BASE + (symbol - '0')
            }
        }
        return ((base shl Byte.SIZE_BITS) or part).toInt()
    }
}

private const val DECIMAL_BASE = 10
