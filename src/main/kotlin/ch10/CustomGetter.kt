package ch10

class User {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val user = User()
    user.name = "Norbert"
    user.name = ""
    println(user.name)
}
