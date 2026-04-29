package oop_126564_DimasPradhitya.Week10

fun main(processData: (String) -> Unit) {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin");

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("ASET: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTION ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil Proses: $result")
}


