package ch06

fun lengthIfString(a: Any): Int {
    if (a is String) {
        return a.length
    }
    return 0
}

fun main() {

}