package oop_126564_DimasPradhitya.Week10

// code non-generic
class rumah(val alamat: Any)

// code generic
class kampus<T>(val alamat:T)

// code generic - Multiple Parameter
class Komputer<T, V> (val merk:T, val barcode:V)

// Code generic - function
fun<T> Password(isiPass: T):T {
    return isiPass
}

// code generic - Function ada Contstrain
class kalkulator<T:Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt();
    }

    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

//Generic - WHERE
fun <T> penilaian(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it >= kkm };
}


fun main() {

    println("==== GENERIC - WHERE ====")
    val daftarNilai = listOf(60, 71, 90, 83, 73, 67, 55, 84, 72);
    println("daftar nilai: " + daftarNilai);
    val nilaiAtasKKM = penilaian(daftarNilai, 70)
    println("Nilai diatas KKM: " + nilaiAtasKKM);

    println("==== GENERIC - CONSTRAINT ====")
    val kalk = kalkulator(10.52, 20.347)
    println("penambahan ${kalk.a} ditambah ${kalk.b} : "+ kalk.tambah());
    println("pengurangan ${kalk.a} ditambah ${kalk.b} : "+ kalk.kurang());

    println("==== GENERIC - FUNCTION ====")
    println("Password kamu: " + Password("12345"))

    println("==== SAMPLE GENERIC - MULTI PARAM ====")
    val komp = Komputer("Dell", 12345)
    println("Merk komputer :" + komp.merk)
    println("Komputer : + ${komp.barcode}")



    println("==== SAMPLE NON-GENERIC ====")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(rmh.alamat + 50)

    println("==== SAMPLE GENERIC ====")
    val kmps = kampus(alamat = 300)
    println(kmps.alamat + 50)
}