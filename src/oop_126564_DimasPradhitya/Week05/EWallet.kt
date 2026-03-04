package oop_126564_DimasPradhitya.Week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - E-Wallet] Pembayaran Rp $amount Berhasil. Sisa saldo: Rp $balance")
        }else {
            println("[$accountName - EWallet] Saldo tidak cukup untuk membayar Rp $amount")
        }
    }

    fun topUp(amount: Doube) {
        balance -= amount
        println("[$accountName - EWallet] Top up Rp $amount berhasil. Saldo sekarang: Rp $balance")
    }
}