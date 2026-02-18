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

    //Hanya bis diakses di file/class ini saja
    private var performanceRating: Int = 3

    fun increasePerformace() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // Kita tidak buat getter untuk performanceRating. jadi data ini benar-benar rahasia
// Kecuali kita buat function khusus utnuk print.
    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}