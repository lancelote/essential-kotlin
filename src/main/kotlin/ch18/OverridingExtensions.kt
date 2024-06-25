package ch18

open class View

class Button : View()

fun Button.printMe() = println("I'm a button")

fun View.printMe() = println("I'm a view")

fun main() {
    val button = Button()
    button.printMe()

    val view: View = button
    view.printMe()
}
