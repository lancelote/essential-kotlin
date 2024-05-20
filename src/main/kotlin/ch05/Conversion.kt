package ch05

fun main() {
    val b: Byte = 123
    val l = 123L  // Long
    val i = 123   // Int

    val i1 = b.toInt()
    val i2 = l.toInt()
    val l1 = b.toLong()
    val l2 = i.toLong()

    println(i1)
    println(i2)
    println(l1)
    println(l2)
}
