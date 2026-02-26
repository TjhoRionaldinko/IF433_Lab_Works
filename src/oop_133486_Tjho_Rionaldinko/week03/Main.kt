package oop_133486_Tjho_Rionaldinko.week03

fun main() {
    println("=== TOKO SENJATA GAME ONLINE ===")
    println("Membuat senjata baru dengan damage 500...")

    val weapon = Weapon("Keris Sakti", 500)
    println("Senjata: ${weapon.name}")
    println("Damage awal: ${weapon.damage}")
    println("Tier awal: ${weapon.tier}")
    println("-".repeat(40))

    println("TEST 1: Mencoba set damage ke -50")
    println("Mengubah damage ke -50...")
    weapon.damage = -50
    println("Hasil: Damage = ${weapon.damage}, Tier = ${weapon.tier}")
    println("-".repeat(40))

    println("TEST 2: Mencoba set damage ke 9999")
    println("Mengubah damage ke 9999...")
    weapon.damage = 9999
    println("Hasil: Damage = ${weapon.damage}, Tier = ${weapon.tier}")
    println("-".repeat(40))

    println("TEST 3: Membuat senjata baru dengan damage 1200")
    val weapon2 = Weapon("Nunchaku", 1200)
    println("Senjata: ${weapon2.name}")
    println("Hasil: Damage = ${weapon2.damage}, Tier = ${weapon2.tier}")
    println("-".repeat(40))

    println("=== TEST SENJATA SELESAI ===")
    println("\n" + "=".repeat(50))
    println("=== SISTEM LEVELING PLAYER ===")

    val player = Player("JoeMama")
    println("Player dibuat dengan username: ${player.username}")
    println("-".repeat(40))

    println("Mencoba akses xp langsung: (TIDAK BISA - properti private)")
    println("Hanya bisa melihat XP melalui fungsi showStatus()")
    player.showStatus()
    println("-".repeat(40))

    println("TEST 1: Menambah 50 XP")
    player.addXp(50)
    player.showStatus()
    println("-".repeat(40))

    println("TEST 2: Menambah 60 XP (total 110 XP)")
    player.addXp(60)
    player.showStatus()
    println("-".repeat(40))

    println("TEST TAMBAHAN: Mencoba menambah XP -10 (harus error)")
    player.addXp(-10)
    player.showStatus()
    println("-".repeat(40))

    println("=== TEST PLAYER SELESAI ===")
}