package oop_126564_DimasPradhitya.Week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isuNullorEmptyCustom()}")

println("\n=== TEST RUN FUNCTION ====")
val result = "Kotlin".run {
    println("Memproses kata: ${this}") // 'this bisa dihilangkan (implicit)
    length * 2
    }
    println("Hasil kalkulasi run $result")


    val newUser = User("Budi", 20).apply {
        age = 21 // Mengubah umur
    }.also {
        println("User baru berhasil dibuat: $it")
    }
}