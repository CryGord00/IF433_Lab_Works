package oop_126564_DimasPradhitya.week03

open class Bapake {
    private var nama:String = "Belum tau";
    private var umur:Int = 35;
   protected var gaji: Int = 1000;

    public var uangjajan: Int = 0
            set(value) {
                if(value<0) {
                    println("Masa uang jajan 0 atau minus");
                }else {
                    field = val ue;
                }
            }
            get() {
                return field + 123
            }

    public fun set_nama(namabaru:String){
        if(this.nama.length <= 0) {
            println("Eh  nama ga boleh kosong");
        }else {
            this.nama= namabaru;
        }
    }
    public fun get_nama():String{
        return this.nama;
    }

    public fun set_umur(umurbaru:Int){
       if(this.umur <= 0) {
           println("Eh  umur boleh kosong");
       }else{
           this.umur = umurbaru;
       }
    }
    public fun get_umur():Int {
        return this.umur;
    }
}//close class

class Anake: Bapake() {
    fun dapetin_gaji_bapak(): Int {
        this.gaji = 5500;
        return this.gaji + 100;
    }
}

fun main() {
    var ank = Anake();
    ank.set_nama("Udin");
    println("Nama papi kamu ${ank.get_nama()}, dan umurnya adalah ${ank.get_umur()}");
    println("Gaji bapak : " + ank.dapetin_gaji_bapak());

    ank.uangjajan = -100
}