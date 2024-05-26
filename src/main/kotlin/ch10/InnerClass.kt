package ch10

class Puppy(val name: String) {
    inner class InnerPuppy {
        fun think() {
            println("inner $name is thinking")
        }
    }
}

fun main() {
    val puppy = Puppy("Cookie")
    val innerPuppy = puppy.InnerPuppy()
    innerPuppy.think()
}
