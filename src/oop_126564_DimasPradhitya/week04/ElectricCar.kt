package oop_126564_DimasPradhitya.week04

//Class ElectricCar sebagai Child dari class Car
class ElectricCar (
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    //Override dengan keyword 'final' agar tidak bisa diubah lagi
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}