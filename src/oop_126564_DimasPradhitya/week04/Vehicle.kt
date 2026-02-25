package oop_126564_DimasPradhitya.week04

// Gunakan Keyword 'open' agar class bisa diwariskan
open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Method juga bersifat final secara default. Gunakan 'open' agar bisa di-override.
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")

    }

    open fun honk() {
        println("Beep beep!")
    }

}

// Car "Is-A" Vehicle. Parameter barnd dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka. ")
    }

    override fun honk() {
    println("TIN TIN! Mobil $brand lewat!")
    }
}
