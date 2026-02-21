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
    // Tax (Pajak) dihitung 10% dari gaji saat ini
    val tax: Double
        get() = salary * 0.1

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

        fun main() {
            val e = Employee("Budi")

            //1. Test Validasi Salary
            e.salary = -100 // Harusnya print Erorr
            e.salary = 500000
            println("Gaji: ${e.salary}")

            // 2. Test Encapsulation
            e.increasePerformace()
            // e.performanceRating = 5 // Coba iuncoment, pasti

            // 3. Test Computed Property
            println("Pajak yang harus dibayar: ${e.tax}")
        }
    }
}