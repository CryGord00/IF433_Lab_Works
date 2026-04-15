package oop_126564_DimasPradhitya.Week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    //Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDatails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val recipt = validOrder.totalprice?.let { price ->
        // Blok ini HANYA jalan jika total.Price tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(recipt)

}