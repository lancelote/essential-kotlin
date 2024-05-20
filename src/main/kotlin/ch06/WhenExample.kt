package ch06

fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    when {
        num < 0 -> "negative"
        num > 0 -> "positive"
        else -> "zero"
    }.print()
}

fun main() {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)
}
