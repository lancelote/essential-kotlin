package ch11

open class Animal(val name: String)

class Dog2(name: String) : Animal(name)

class Cat2(name: String) : Animal("Mr $name")

fun main() {
    val dog = Dog2("Cookie")
    println(dog.name)

    val cat = Cat2("MiauMiau")
    println(cat.name)
}
