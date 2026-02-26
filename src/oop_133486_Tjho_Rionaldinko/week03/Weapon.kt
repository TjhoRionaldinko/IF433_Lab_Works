package oop_133486_Tjho_Rionaldinko.week03

class Weapon(val name: String, damageInput: Int) {

    var damage: Int = damageInput
        set(value) {
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif!")
                }
                value > 1000 -> {
                    println("Damage terlalu besar! Diset ke 1000.")
                    field = 1000
                }
                else -> field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}