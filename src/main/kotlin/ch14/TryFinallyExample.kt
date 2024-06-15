package ch14

fun someOtherFunction() {
    throw Throwable("some error")
}

fun main() {
    try {
        someOtherFunction()
    } finally {
        println("finally block was called")
    }
    println("won't be printed")
}
