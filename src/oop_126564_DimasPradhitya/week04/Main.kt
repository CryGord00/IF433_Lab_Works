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

    println("\n--- Testing Electric Car ---")
    val myEv = ElectricCar( brand = "Tesla model S", 4, 100)
    myEv.openTrunk() // Memanggil method dari class car
    myEv.honk() // Memanggil method dari class Vehicle
    myEv.accelerate() // memanggil method final dari ElectricCar

    println("\n---- Testing Employee Hierarchy ---")

    // Instansiasi objek Manager dan Developer
    val manager = Manager("Andika", 8000000);
    val developer = Developer ("Revand", 5500000, "Javascript" );

    // Memanggil fungsi Work() dan cetak hasil CalculateBonus
    manager.work()
    println("Bonus Manger: Rp ${manager.calculateBonus()}");

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}");
}
