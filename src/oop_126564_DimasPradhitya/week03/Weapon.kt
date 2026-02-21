package oop_126564_DimasPradhitya.week03

class Weapon(val name: String) {
    // Properti damage dengan Custom Setter (Validasi)
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai tetap $field.")
                // Tidak mengubah field jika input negatif
            } else if (value > 1000) {
                println("Peringatan: Damage terlalu OP! Dipaksa ke maksimal 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property untuk menentukan Tier senjata berdasarkan damage
    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}