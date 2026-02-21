package oop_126564_DimasPradhitya.week03

class Player(val username: String) {
    // Langkah 9: Private property agar XP tidak bisa diubah langsung dari luar
    private var xp: Int = 0

    // Computed property untuk menghitung level (XP / 100 + 1)
    val level: Int
        get() = (xp / 100) + 1

    // Fungsi untuk menambah XP dengan logika Level Up
    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = level
            xp += amount
            println("--- $username mendapatkan $amount XP ---")

            // Cek apakah naik level
            if (level > levelSebelumnya) {
                println("CONGRATS! $username naik ke Level $level!")
            }
        }
    }

    fun printStatus() {
        println("Player: $username | XP: $xp | Level: $level")
    }
}