package ch07

fun a(vararg params: Int) {
    for (x in params) {
        println(x)
    }
}

fun main() {
    a()
    a(1)
    a(1, 2)
    a(1, 2, 3)
}
