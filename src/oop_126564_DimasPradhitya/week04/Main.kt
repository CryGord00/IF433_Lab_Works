package oop_126564_DimasPradhitya.week04

fun main() {
    println("--- Testig Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car ---")
    val myCar = Car( brand= "Toyota", numberOfDoors = 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk()      // Memanggil method yang sudah di-override
    myCar.accelerate()// Memanggil gabungan method Parent dan Child

    println("\n---Testing Electric Car ---")
    val myEv = ElectricCar( brand = "Toyota", numberOfDoors = 4)
    myEv.openTrunk() // Memanggil method dari class car
    myEv.honk() // Memanggil method dari class Vehicle
    myEv.accelerate() // memanggil method final dari ElectricCar
}
