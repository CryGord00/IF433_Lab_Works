package oop_126564_DimasPradhitya.Week05

fun main() {
    val dosen1 = Dosen (nama = "Pak Alex", nidn="0123456")
    val adin1 = Admin (nama= "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe parent, taoi isinya objek Anak
    val daftarPegawai: list<Pegawai> = Listof(dosen1, admin1)

    println("=== AKTIVASI PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() // INI AKAN EOROR karena tipe referensinya adalah Pegawai
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar() // Smart Cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
}