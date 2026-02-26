package oop_133486_Tjho_Rionaldinko.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1


    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("ERROR: Jumlah XP harus positif! ($amount tidak valid)")
            return
        }

        val levelBefore = level

        xp += amount
        println("$username mendapatkan $amount XP!")

        if (level > levelBefore) {
            println("Naik Level! Selamat $username naik ke level $level")
        }
    }

    fun showStatus() {
        println("""
            Status Player:
            Username: $username
            XP: $xp
            Level: $level
            XP to next level: ${(level * 100) - xp} XP
        """.trimIndent())
    }
}