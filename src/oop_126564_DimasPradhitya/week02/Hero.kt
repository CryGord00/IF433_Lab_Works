//package oop_126564_DimasPradhitya.week02
//
//class Hero(
//    val name: String,
//    var baseDamage: Int,
//    var hp: Int = 100 // Default Argument HP = 100
//) {
//    // Method untuk simulasi serangan
//    fun attack(targetName: String) {
//        println("$name menebas $targetName!")
//    }
//
//    // Method untuk menerima damage dengan logika HP minimal 0
//    fun takeDamage(damage: Int) {
//        hp -= damage
//        if (hp < 0) hp = 0
//    }
//
//    // Method untuk cek apakah hero masih hidup
//    fun isAlive(): Boolean {
//        return hp > 0
//    }
//}