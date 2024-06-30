package ch20

class CheerUseCase {
    operator fun invoke(who: String) {
        println("hello, $who")
    }
}

fun main() {
    val hello = {
        println("hello")
    }
    hello()

    val cheerUseCase = CheerUseCase()
    cheerUseCase("Reader")
}
