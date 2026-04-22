package oop_126564_DimasPradhitya.Week09

fun main() {
    println("====== LIST OF IMUT ======")
    val arSiswa = listOf("Budi","Danu", "Susi", "Cica" );
    //View
    println(arSiswa);   //object -> array

    //Panjang array
    println("banyak siswa:" + arSiswa.size);

    //munculin satu orang aja
    println("siswa bermana ${arSiswa[1]}");

    //munxulin semua orang ---> for each
    for(a in arSiswa) {
        print("Siswa " + a + " dan ");
    }

    println("====== LIST OF MUTABLE ======")
    val arMatkul = mutableListOf ("OOP", "Penweb", "Matdis", "Kalkulus");
    arMatkul.add("Algo")
    arMatkul[2]= "Aljabar Linear"
    arMatkul.remove("pemweb")
    println(arMatkul);

    println("====== SET OF IMUT ======")
    val arNilai = setOf(80,90,75,85,80,30,50,85);
    println("Banyak nilai: ${arNilai.size}");
    println("ada angka 90 gak? ${arNilai.contains(90)}");
    println(arNilai);

    println("====== SET OF MUTABLE======")
    val arMahasiswa = mutableSetOf("Andi", "Yanto", "Yuda");
    arMahasiswa.add("Yanti");
    arMahasiswa.remove("udin")
    arMahasiswa.add("Udin");
    println(arMahasiswa);

    println("====== MAP IMUT ======")
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakao" to 3000,
        "Sayur asem" to 2500
    );
    println("banyak menu ${arResto.size}");
    println("Harga ayam ${arResto["Ayam"]}");
    println("List makanan: ${arResto.keys}");
    println("list harga: ${arResto.values}");
    println(arResto);

    println("====== MAP MUTABLE ======")
    val arKHS = mutableMapOf(
        "Tony" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Ara");
    arKHS["Nika"] = 92
    arKHS["Cinta"]= 99
    println(arKHS);

    println("====== LAMBDA ======")
    //function biasa
    fun tambah(a:Int, b:Int): Int {
        return a + b;
    }
    println("Hasil penambahan ${tambah(5, 3)}")
    //function Lambda -> tulisnya kesamping/horisontal
    val kurang = {a:Int, b:Int->a-b};
    println("Hasil pengurangan ${kurang(5,3)}");

    println("====== LAMBDA {IT} ======")
    val pangkat = {a:Int, b:Int->a+a};
    val hasilpangkat:(Int)-> Int = {it*it}
    println("Hasil pangkat ${hasilpangkat(5)}")

    println("====== FOREACH BIASA ======")
    for(a in arMatkul){
        println(a);
    }

    println("====== FOREACH IT ======")
    arMatkul.forEach {
        println(it)
    }

    println("====== FOREACH VARIABLE ======")
    arMatkul.forEach {mk ->
        println(mk);
    }

}