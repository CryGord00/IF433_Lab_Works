package oop_126564_DimasPradhitya.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - CreditCard] Transaksi Rp $amount Sukses. Limit terpakai: Rp $usedAmount")
        } else {
            println("[$accountName - CreditCard] Transaksi ditolak! Melebihi limit.")
        }
    }
}