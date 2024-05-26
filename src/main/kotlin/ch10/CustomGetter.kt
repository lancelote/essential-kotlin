package ch10

class User {
    var name: String = ""
        get() = field.uppercase()
}

fun main() {
    val user = User()
    user.name = "Norbert"
    println(user.name)
}
