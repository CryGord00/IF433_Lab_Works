//package oop_126564_DimasPradhitya.week02
//
//class Loan(
//    val bookTitle: String,
//    val borrower: String,
//    var loanDuration: Int = 1 // Default Argument [cite: 106]
//) {
//    // Method untuk menghitung denda [cite: 106]
//    fun calculateFine(): Int {
//        // Jika durasi > 3 hari, denda = (Durasi - 3) * 2000 [cite: 107]
//        return if (loanDuration > 3) {
//            (loanDuration - 3) * 2000
//        } else {
//            0 // Jika <= 3 hari, denda = 0 [cite: 109]
//        }
//    }
//}