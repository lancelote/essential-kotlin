package ch18

class A {
    companion object
}

fun A.Companion.foo() {}

fun main() {
    A.foo()

    val a: A.Companion = A
    a.foo()
}
