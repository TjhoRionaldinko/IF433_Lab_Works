package oop_133486_Tjho_Rionaldinko.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Vehicle ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar("Wuling", 2, 100)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Test Employee ---")
    val employee = Employee("Udin", 8000000)
    employee.work()
    println("Bonus: ${employee.calculateBonus()}")

    println("\n--- Test Manager ---")
    val manager = Manager("Asep", 20000000)
    manager.work()
    println("Bonus: ${manager.calculateBonus()}")
}