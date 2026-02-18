package oop_126564_DimasPradhitya.week03

fun main() {
    val e = Employee.("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 // Harusnya print Eror
    e.salary = 5000000
    println("gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.increasePerformance = 5 // Coba uncomment, pasti merah (Eror)

    // 3> test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}