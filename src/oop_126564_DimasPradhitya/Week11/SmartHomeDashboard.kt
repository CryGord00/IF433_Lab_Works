package oop_126564_DimasPradhitya.Week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        var isOnline = true
        powerLoad = 12
    }.also { homeDevices.add(it) }

}