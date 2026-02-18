package oop_126564_DimasPradhitya.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
            println("Eror: Gaji tidak boleh negatif! Di-set ke 0.")
            field = 0 // Gunakan field, bukan this.salary
            } else {
                field = value
            }
        }
}
