package oop_126564_DimasPradhitya.week04

// Gunakan Keyword 'open' agar class bisa diwariskan
open class Vihicle(Val brand: String) {
    var speed: Int = 0

    // Method juga bersifat final secara default. Gunakan 'open' agar bisa di-override.
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")

    }

    open fun honk() {
        println("Beep beep!")
    }