package ch09

lateinit var text: String

private fun printIfInitialized() {
    if (::text.isInitialized) {
        println(text)
    } else {
        println("not initialized")
    }
}

fun main() {
    printIfInitialized()
    text = "ABC"
    printIfInitialized()
}
