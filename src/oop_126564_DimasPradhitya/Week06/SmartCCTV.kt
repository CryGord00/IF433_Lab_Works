package oop_126564_DimasPradhitya.Week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] CCTV diaktifkan.")
        startRecord() // Memanggil otomatis sesuai modul
    }

    override fun turnOff() {
        println("[$name] CCTV dinonaktifkan.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Lensa berputar, mulai merekam aktivitas...")
    }
}