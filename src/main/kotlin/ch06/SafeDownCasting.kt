package ch06

fun main() {
    val n: Number = 123

    val i: Int? = n as? Int
    println(i)

    val d: Double? = n as? Double
    println(d)
}
