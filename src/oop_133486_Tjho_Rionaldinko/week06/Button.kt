package oop_133486_Tjho_Rionaldinko.week06

class Button(override val name: String) : CLickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}