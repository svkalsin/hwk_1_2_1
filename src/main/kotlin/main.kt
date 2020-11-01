package ru.netology

fun main() {
    val amount = 500000
    val minCommission =3500
    val percentCommission = 0.0075f
    val amountPercentCommission = amount*percentCommission
    val commission = if (amountPercentCommission < minCommission) minCommission/100 else amountPercentCommission/100

    print("Комиссия составит: $commission рублей")
}