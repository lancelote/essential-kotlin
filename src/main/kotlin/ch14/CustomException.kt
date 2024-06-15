package ch14

class MyException : Throwable("some message")

private fun functionThrowing() {
    throw MyException()
}

fun main() {
    println("before")
    functionThrowing()
    println("after")
}
