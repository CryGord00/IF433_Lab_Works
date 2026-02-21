package oop_126564_DimasPradhitya.week03

fun main() {
    // --- TESTING TUGAS 1: WEAPON ---
    println("=== TESTING WEAPON ===")
    val mySword = Weapon("Excalibur")

    // Sesuai Instruksi: Set damage ke -50 (harus gagal/tidak berubah)
    mySword.damage = -50

    // Sesuai Instruksi: Set damage ke 9999 (harus jadi 1000)
    mySword.damage = 9999

    // Cetak Tier (Harus muncul "Legendary" karena damage 1000)
    println("Senjata: ${mySword.name} | Damage: ${mySword.damage} | Tier: ${mySword.tier}")
    println("-----------------------")

    // --- TESTING TUGAS 2: PLAYER ---
    println("\n=== TESTING PLAYER ===")
    val player1 = Player("Dimas_Pro")

    // Sesuai Instruksi: Panggil addXp(50) -> Masih Level 1
    player1.addXp(50)

    // Sesuai Instruksi: Panggil addXp(60) -> Total 110, harus Level Up ke 2
    player1.addXp(60)
}
}