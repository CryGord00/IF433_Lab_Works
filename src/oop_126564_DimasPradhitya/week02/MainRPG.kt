//package oop_126564_DimasPradhitya.week02
//
//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//
//    // 1. Input nama Hero & stat Damage [cite: 132]
//    print("Masukkan Nama Hero: ")
//    val heroName = scanner.nextLine()
//    print("Masukkan Base Damage Hero: ")
//    val heroDamage = scanner.nextInt()
//
//    // Membuat Objek Hero [cite: 132]
//    val player = Hero(heroName, heroDamage)
//
//    // 2. Musuh (Enemy) cukup variabel bantuan [cite: 133]
//    var enemyHp = 100
//
//    // 3. Loop while (selama Hero hidup DAN enemyHp > 0) [cite: 134]
//    while (player.isAlive() && enemyHp > 0) {
//        println("\nHP ${player.name}: ${player.hp} | HP Musuh: $enemyHp")
//        println("Menu: 1. Serang, 2. Kabur")
//        print("Pilih aksi: ")
//        val choice = scanner.nextInt()
//
//        if (choice == 1) {
//            // Aksi Serang [cite: 136]
//            player.attack("Musuh")
//            enemyHp -= player.baseDamage
//            println("Sisa HP musuh: $enemyHp")
//
//            // Jika Musuh belum mati, Musuh membalas! [cite: 137]
//            if (enemyHp > 0) {
//                val monsterDamage = (10..20).random() // Random damage 10-20 [cite: 139]
//                player.takeDamage(monsterDamage)
//                println("Musuh membalas! ${player.name} terkena $monsterDamage damage.")
//            }
//        } else if (choice == 2) {
//            // Aksi Kabur [cite: 141]
//            println("Kamu memutuskan untuk kabur... Game Over!")
//            break
//        }
//    }
//
//    // 4. Umumkan pemenang berdasarkan sisa HP [cite: 142]
//    println("\n--- PERTANDINGAN BERAKHIR ---")
//    if (enemyHp <= 0) {
//        println("Selamat! ${player.name} Menang!")
//    } else if (!player.isAlive()) {
//        println("${player.name} telah gugur. Kamu Kalah!")
//    }
//}