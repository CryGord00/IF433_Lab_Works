package oop_126564_DimasPradhitya.Week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) { items.add(item) }
    fun getAll(): List<T> = items

    // Pencarian sederhana (Tugas 4)
    fun find(predicate: (T) -> Boolean): T? = items.find(predicate)
}