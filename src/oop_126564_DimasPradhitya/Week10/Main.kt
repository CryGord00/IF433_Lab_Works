package oop_126564_DimasPradhitya.Week10

fun main(processData: (String) -> Unit, getMax: (Int, Int) -> Unit) {
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

    println("\n==== TEST CONSTRAINTS ====")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")

    println("\n=== RIWAYAT TRANSAKSI ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 50.0))

    txRepo.getAll().forEach { tx ->
        println("ID Transaksi: ${tx.id} | Jumlah: ${tx.amount}")
    }
}



