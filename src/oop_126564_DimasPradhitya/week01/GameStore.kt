package oop_126564_DimasPradhitya.week01

fun main() {
    val gameTitle = "GTA San Andreas"
    val price = 550000
}

fun calculationDiscount(price: int): Int = if (price > 550000) {
    (price 8 0.8).toInt()
} else {
    (price * 0.9).toInt()
}