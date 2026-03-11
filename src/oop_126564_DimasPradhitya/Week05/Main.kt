//package oop_126564_DimasPradhitya.Week05
//
//fun main() {
//    val dosen1 = Dosen (nama = "Pak Alex", nidn="0123456")
//    val admin1 = Admin (nama= "Bu Siti")
//
//    // Polymorphic Collection: List yang berisi tipe parent, taoi isinya objek Anak
//    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
//
//    println("=== AKTIVASI PEGAWAI ===")
//    for (pegawai in daftarPegawai) {
//        // Pemanggilan Runtime Polymorphism
//        pegawai.bekerja()
//
//        //pegawai.mengajar() // INI AKAN EROR karena tipe referensinya adalah Pegawai
//        // Smart Casting dengan is dan when
//        when (pegawai) {
//            is Dosen -> {
//                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
//                pegawai.mengajar() // Smart Cast! Tidak perlu manual casting (as)
//            }
//            is Admin -> {
//                println("=> Terdeteksi sebagai Admin")
//                pegawai.doAdminWork()
//            }
//        }
//        println("-------------------------")
//    }
//
//    val math = MathHelper()
//    println("Luas Persegi: ${math.hitungLuas(5)}")
//    println("Luas Persegi Panjang: ${math.hitungLuas(5, 10)}")
//    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")
//
//    // --- Tugas Mandiri 2: Sistem Pembayaran ---
//    println("\n--- Sistem Pembayaran E-Commerce ---")
//    val dompetKu = EWallet("Dimas", 50000.0)
//    val kartuKu = CreditCard("Dimas", 100000.0)
//
//    val listPembayaran = listOf(dompetKu, kartuKu)
//
//    for (metode in listPembayaran) {
//        println("\nMemproses transaksi Rp 75.000 menggunakan ${metode.accountName}")
//        metode.processPayment(75000.0)
//
//        // Smart Casting Challenge (Instruksi Poin 5)
//        if (metode is EWallet) {
//            println("Mendeteksi EWallet... Melakukan top up otomatis.")
//            metode.topUp(50000.0) // Smart cast otomatis ke EWallet
//            metode.processPayment(75000.0) // Coba bayar lagi
//        }
//    }
//    }