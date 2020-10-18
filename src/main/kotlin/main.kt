package ru.netology

fun main() {
    val amount = 500000
    val minCommission =3500
    val percentCommission = 0.0075f

    val commission = if (amount*percentCommission < minCommission) minCommission/100 else amount*percentCommission/100

    print("Комиссия составит: $commission рублей")
}