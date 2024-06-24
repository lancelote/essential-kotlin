package ch18

class Telephone(val number: String)

fun Telephone.call() {
    print("calling $number")
}

fun main() {
    val telephone = Telephone("123456789")
    telephone.call()
}
