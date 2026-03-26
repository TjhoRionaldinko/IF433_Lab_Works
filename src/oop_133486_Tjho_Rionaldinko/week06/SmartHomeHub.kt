package oop_133486_Tjho_Rionaldinko.week06

class SmartHomeHub() {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}