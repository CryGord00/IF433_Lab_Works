package oop_126564_DimasPradhitya.week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!") [cite: 31, 32]
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.") [cite: 35]
        }
    }
    // Secondary Constructor
    // Wajib memanggil Primary Constructor menggunakan "this()"
    constructor(name: String, nim: String) : this(name, nim, major ="Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).") [cite: 49, 52]
    }
}
