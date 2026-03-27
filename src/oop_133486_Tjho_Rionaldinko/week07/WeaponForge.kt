package oop_133486_Tjho_Rionaldinko.week07

class Weapon private constructor(
    val item: Item,
    val durability: Int
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = Item(
                "Pedang Kayu Bapuk",
                5,
                ItemRarity.COMMON)
            return Weapon(item, durability = 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = Item(
                "Pedang Epic Mahal",
                500,
                ItemRarity.EPIC)
            return Weapon(item, durability = 100)
        }
    }
}