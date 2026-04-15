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

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smarthphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        //Hanya cetak jika cast sukses (text tidak null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

val someObject: Any = 100 // Tipe aslinya Integer
val safeString = someObject as? String ?: "Unknown String"
println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        //DENGAROUS: MEmaksa compiler percaya data ini tidak null
        val length = toxicData!!.length
    }catch (e: NullPointerException) {
        println("CRASH (NPE)! jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        // Alih-alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)  // Mencetak pesan custom kita, bukan crash buta
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    // Kita menenkan tombol !! karena KITA TAHU implementasi java-nya aman
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (Length: $statusLength)")
}
