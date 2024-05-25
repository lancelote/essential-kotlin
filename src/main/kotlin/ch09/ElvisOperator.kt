package ch09

class Person(val name: String)

fun printName(person: Person?) {
    val name: String = person?.name ?: "default"
    println(name)
}

fun main() {
    printName(Person("Alice"))
    printName(null)
}
