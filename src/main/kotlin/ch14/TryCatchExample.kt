package ch14

fun someFunction() {
    throw MyException()
}

fun main() {
    try {
        someFunction()
    } catch (e: MyException) {
        println("caught $e")
    }
}
