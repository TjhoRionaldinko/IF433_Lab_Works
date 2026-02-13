package oop_133486_Tjho_Rionaldinko.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)

    var enemyHp = 100

    println("\nPertarungan dimulai! Musuh memiliki HP $enemyHp\n")

    while (hero.isAlive() && enemyHp > 0) {

        println("Menu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        when (choice) {

            1 -> {
                hero.attack("Musuh")

                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("HP Musuh tersisa: $enemyHp")

                // Jika musuh masih hidup, dia membalas
                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh menyerang balik sebesar $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                    println("HP Hero tersisa: ${hero.hp}")
                }
            }

            2 -> {
                println("${hero.name} memilih kabur!")
                break
            }

            else -> println("Pilihan tidak valid!")
        }

        println()
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.hp > enemyHp) {
        println("${hero.name} MENANG!")
    } else if (enemyHp > hero.hp) {
        println("Musuh MENANG!")
    } else {
        println("Seri!")
    }
}