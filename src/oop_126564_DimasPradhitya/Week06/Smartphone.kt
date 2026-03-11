package oop_126564_DimasPradhitya.Week06

// ERROR: Class Smartphone inherits multiple implementtations of turnOn()
class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnOn() {
             super<Camera>.turnOn() // Menjalankan logika Camera
             super<Phone>.turnOn() // Menjalankan logika Phone
    }
}