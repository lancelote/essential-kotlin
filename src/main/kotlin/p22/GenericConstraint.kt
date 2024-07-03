package p22

interface Animal {
    fun feed()
}

interface GoodTempered {
    fun pet()
}

fun <T> pet(animal: T) where T : Animal, T: GoodTempered {
    animal.feed()
    animal.pet()
}

class Cookie : Animal, GoodTempered {
    override fun feed() {}
    override fun pet() {}
}

class Cujo : Animal {
    override fun feed() {}
}

fun main() {
    pet(Cookie())
    pet(Cujo())
}
