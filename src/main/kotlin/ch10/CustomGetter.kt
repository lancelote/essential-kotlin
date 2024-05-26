package ch10

class User {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
    var surname: String = ""
    val fullName: String
        get() = "$name $surname"

}

fun main() {
    val user = User()
    user.name = "Norbert"
    user.name = ""
    user.surname = "Doe"

    println(user.fullName)
}
