package oop_126564_DimasPradhitya.week02

import java.util.Scanner
fun main() {
    val scanner = Scaneer(source = System. 'in')

    println("--- APLIKASI PMB UMN ---")

    println("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() //Bersihkan buffer newline penyakit klasik Scanner!)

    //Validasi di sisi pemanggil (Main)
    if (nim.length !=5){
       println("EROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
         println("Masukan jurusan: ")
         val major = scanner.nextline()

         // Instansiasi objek karena data sudah aman
         val sl = Student(name, nim, major)
         println("Status: Pendaftaran Selesai.")
    }
}