//package oop_126564_DimasPradhitya.week02
//
//fun main() {
//    val scanner = java.util.Scanner(System.`in`)
//    println("--- SISTEM PERPUSTAKAAN ---")
//
//    print("Judul Buku: ")
//    val title = scanner.nextLine()
//    print("Nama Peminjam: ")
//    val borrower = scanner.nextLine()
//    print("Lama Pinjam (Hari): ")
//    var duration = scanner.nextInt()
//
//    // Validasi: Jika minus, otomatis ubah menjadi 1 hari [cite: 115, 116]
//    if (duration < 0) {
//        duration = 1
//    }
//
//    // Buat objek Loan [cite: 117]
//    val pinjaman = Loan(title, borrower, duration)
//
//    println("\n--- Detail Peminjaman ---")
//    println("Buku: ${pinjaman.bookTitle}")
//    println("Peminjam: ${pinjaman.borrower}")
//    println("Lama Pinjam: ${pinjaman.loanDuration} hari")
//    println("Total Denda: Rp ${pinjaman.calculateFine()}")
//}