package ch11

open class Dog3 {
    open fun seeFriend() {
        println("wave its tail")
    }
}

class BorderCollie : Dog3() {
    override fun seeFriend() {
        println("lie down")
        super.seeFriend()
    }
}

fun main() {
    val dog = Dog3()
    dog.seeFriend()

    val borderCollie = BorderCollie()
    borderCollie.seeFriend()
}
