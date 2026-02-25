package oop_126564_DimasPradhitya.week04

open class Employee(val nama: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja. ");
    }

    open fun calculateBonus(): Int {
        // Bonus 10% dari gaji pokok
        return (0.1 * baseSalary).toInt()
    }
}