package ch13

object Point {
    var x = 0
    var y = 0
}

fun main() {
    println(Point.x)
    Point.y = 10
    println(Point.y)

    val p = Point
    p.x = 20
    println(Point.x)
    println(Point.y)
}
