package oop_133486_Tjho_Rionaldinko.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn(){
        println("Lampu '$name', '$id' menyala.")
    }
    override fun turnOff(){
        println("Lampu '$name', '$id' mati.")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}