package oop_126564_DimasPradhitya.Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            // Jika Recordable, panggil startRecord
            if (device is Recordable) {
                device.startRecord()
            }
            // Jika SmartSpeaker, casting dan panggil playMusic
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}