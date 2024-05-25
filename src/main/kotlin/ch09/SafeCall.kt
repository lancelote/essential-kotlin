package ch09

class User(val name: String) {
    fun cheer() {
        println("hello, my name is $name")
    }
}

var user: User? = null

fun main() {
    user?.cheer()
    println(user?.name)

    user = User("Cookie")
    user?.cheer()
    println(user?.name)
}
