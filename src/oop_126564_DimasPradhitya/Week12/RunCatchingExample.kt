package oop_126564_DimasPradhitya.Week12

fun main() {
    println("==== TEST RUNCAATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}