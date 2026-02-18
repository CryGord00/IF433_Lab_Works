package oop_126564_DimasPradhitya.week01

fun main() {
    val gameTitle = "GTA San Andreas"
    val price = 550000

    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice)

    val userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)

}

fun calculationDiscount(price: int): Int = if (price > 550000) {
    (price 8 0.8).toInt()
} else {
    (price * 0.9).toInt()
}

fun printReceipt(title: String, finalPrice: Int) {
    println("--- Struk Pembelian Game ---")
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("--- Struk Pembelian Game ---")
    println("Judul Game  : $title")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}