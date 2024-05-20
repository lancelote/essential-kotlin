package ch05

fun main() {
    println(0b0101 and 0b0001) // 1,  0b0001
    println(0b0101 or  0b0001) // 5,  0b0101
    println(0b0101 xor 0b0001) // 4,  0b0100
    println(0b0101 shl 1)      // 10, 0b1010
    println(0b0101 shr 1)      // 2,  0b0010
}
