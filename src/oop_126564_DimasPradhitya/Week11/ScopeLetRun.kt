package oop_126564_DimasPradhitya.Week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    //Mengeksekusi blok hnay jika obejk tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length // mengembalikan nilai expression terakhir

    }
    println("Panjang nama: $length")
}