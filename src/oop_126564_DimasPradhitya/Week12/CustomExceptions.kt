package oop_126564_DimasPradhitya.Week12

// Custom exeption dengan membawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception(" attempetd $amount, balance $balance")