package oop_133486_Tjho_Rionaldinko.week06

class SmartCCTV(
    override val id: String,
    override val name: String
): SmartDevice, Switchable, Recordable {
    override fun turnOff(){
        println("CCTV '$name', '$id' mati.")
    }
    override fun startRecord() {
        println("CCTV '$name', '$id' mulai merekam.")
    }
    override fun turnOn(){
        println("CCTV '$name', '$id' nyala.")
        startRecord()
    }
}