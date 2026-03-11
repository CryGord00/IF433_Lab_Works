package oop_126564_DimasPradhitya.Week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Lampu menyala, ruangan menjadi terang.")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan.")
    }
}