package oop_133486_Tjho_Rionaldinko.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(30),
    UNCOMMON(15),
    RARE(10),
    EPIC(5),
    LEGENDARY(1)
}

data class Item(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)