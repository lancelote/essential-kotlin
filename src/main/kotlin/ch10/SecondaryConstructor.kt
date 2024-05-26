package ch10

class Person(
    var name: String,
    var surname: String
) {

    constructor(person: Person) : this(person.name, person.surname) {}
}

fun main() {
    val person0 = Person("John", "Doe")
    println(person0.name)
    println(person0.surname)

    val person1 = Person(person0)
    println(person1.name)
    println(person1.surname)
}
