package oop_126564_DimasPradhitya.Week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name dengan requireNotNull
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id, name, size)
            }

            else -> null // Unknown type
        }
    }

    fun checkout(product: Product) {
        // Ekstrak ID menggunakan when (Sealed Class)
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Gunakan !! untuk membuktikan Java Interop
        val transactionId = JavaPaymentService.processPayment(id)!!
        println("Checkout Berhasil! Transaction ID: $transactionId")
    }
}
