package ch12

data class FullName(
    val firstName: String,
    val lastName: String,
)

fun String.parseName(): FullName? {
    val indexOfLastSpace = this.lastIndexOf(' ')

    if (indexOfLastSpace < 0) return null

    val firstName = this.take(indexOfLastSpace)
    val lastName = this.drop(indexOfLastSpace)

    return FullName(firstName, lastName)
}

fun main() {
    val fullName = "John Doe"
    val (firstName, lastName) = fullName.parseName() ?: return
    println("his name is $firstName $lastName")
}
