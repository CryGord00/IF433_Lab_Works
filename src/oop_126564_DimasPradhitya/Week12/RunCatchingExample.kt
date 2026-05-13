package oop_126564_DimasPradhitya.Week12

fun main() {
    println("==== TEST RUNCAATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    //Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("safe Value (getOrElse $safeValue)")

    // Pattern: Recover (Bisa mengubah tipe kegagalan jadi sukses
    val recovered = result.recover { 0 }.getOrNull()
    println("Recover Value: $recovered")

    println("\n=== TEST CHAINING ===")
    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }

    var currentKibbleStock = 50
    println("\n=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Peringatan Mekanik: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan Stok: ${e.message}")
    } catch (e: Exception) {
        println("Kesalahan tidak terduga: ${e.message}")
    }

    println("Siklus pengecekan dispenser pagi selesai.")


    println("\n=== JADWAL MAKAN SORE ===")
    currentKibbleStock = 1000


}



