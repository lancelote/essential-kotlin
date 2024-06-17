package ch15

import java.math.BigDecimal

enum class PaymentOption(val commission: BigDecimal) {
    CASH(BigDecimal.ONE),
    CARD(BigDecimal.TEN),
    TRANSFER(BigDecimal.ZERO);
}

fun printOption(option: PaymentOption) {
    println("${option.ordinal}: ${option.name} - ${option.commission}$")
}

fun main() {
    val option = PaymentOption.valueOf("TRANSFER")
    printOption(option)

    println("print all options:")
    for (paymentOption in PaymentOption.entries) {
        printOption(paymentOption)
    }
}
