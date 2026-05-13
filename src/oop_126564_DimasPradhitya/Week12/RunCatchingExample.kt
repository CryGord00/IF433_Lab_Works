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

}

