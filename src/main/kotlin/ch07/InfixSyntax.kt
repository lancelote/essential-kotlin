package ch07

class View

class ViewInteractor {
    infix fun clicks(view: View) {}
}

fun main() {
    val aView = View()
    val interactor = ViewInteractor()

    interactor.clicks(aView)
    interactor clicks aView
}
