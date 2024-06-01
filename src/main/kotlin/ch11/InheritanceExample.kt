package ch11

open class Mammal {
    val haveHairOrFur = true
    val warmBlooded = true
    var canFeed = false

    open fun feedYoung() {
        if (canFeed) {
            println("feeding young with milk")
        }
    }
}

class Dog : Mammal() {
    fun makeVoice() {
        println("bark bark")
    }
}

class Cat : Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("feeding young with food")
        } else {
            println("feeding young wit milk from bottle")
        }
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    dog.makeVoice()

    dog.feedYoung()
    cat.feedYoung()
    cat.canFeed = true
    cat.feedYoung()

    println(dog.haveHairOrFur)
    println(dog.warmBlooded)

    val mammal: Mammal = dog
    mammal.canFeed = true
    mammal.feedYoung()
}
