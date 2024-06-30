package ch20

data class Complex(val real: Double, val imaginary: Double) {

    operator fun plus(another: Complex) = Complex(
        real + another.real,
        imaginary + another.imaginary
    )

    operator fun minus(another: Complex) = Complex(
        real - another.real,
        imaginary - another.imaginary
    )
}

fun main() {
    val c1 = Complex(1.0, 2.0)
    val c2 = Complex(2.0, 3.0)

    println(c1 + c2)
    println(c2 - c1)
}
