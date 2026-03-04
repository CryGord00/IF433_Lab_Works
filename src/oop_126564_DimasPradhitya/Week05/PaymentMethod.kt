package oop_126564_DimasPradhitya.Week05

// Buat abstract class PaymentMethod
abstract class PaymentMethod(val accountName: String) {
    // Abstract function Processpayment
    abstract fun processPayment(amount: Double)
}