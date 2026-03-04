package oop_126564_DimasPradhitya.Week05

class MathHelper {
    // Menghitung luas persegi (paramater: Imt)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Menghitung luas pesegi panjang (paramater: Int, Int)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Menghitung luas lingkaran (paramater: Double)
    fun hitungLuas(jarijari: Double): Double {
        return 3.14 * jarijari * jarijari
    }

}