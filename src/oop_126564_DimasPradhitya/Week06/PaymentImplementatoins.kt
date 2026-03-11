package oop_126564_DimasPradhitya.Week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay Server")}
}

class CreditCrad : PaymentMethod {
    override fun pay(amount: Double) {println("Contancting Bank for Rp$amount")}
}