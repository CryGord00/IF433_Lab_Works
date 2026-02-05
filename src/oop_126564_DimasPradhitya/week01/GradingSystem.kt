package oop_126564_DimasPradhitya.week01

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = string = "Dimas Pradhitya"
    val score = 95
    //Tambahkan di bawah println
    val grade = when (score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
     println("Grade kamu: $grade")
    // REFACTOR: String Template ($name)
    println("Nama: $name, Nilai: $score")
}