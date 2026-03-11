package oop_126564_DimasPradhitya.Week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Speaker aktif dan siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("[$name] Speaker masuk ke mode standby.")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}