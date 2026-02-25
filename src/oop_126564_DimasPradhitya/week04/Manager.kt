package oop_126564_DimasPradhitya.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$nama sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
            // Bonus standar (dari parent) + Rp 500.000
            return super.calculateBonus() + 500000
    }
}