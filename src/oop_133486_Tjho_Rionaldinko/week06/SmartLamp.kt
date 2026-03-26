package oop_133486_Tjho_Rionaldinko.week06

class SmartLamp(
    override val id: String,
    override val name: String
): SmartDevice, Switchable {
    override fun turnOn(){
        println("Lampu '$name', '$id' menyala.")
    }
    override fun turnOff(){
        println("Lampu '$name', '$id' mati.")
    }
}