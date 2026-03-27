package oop_133486_Tjho_Rionaldinko.week07

enum class ItemRarity {
    COMMON(30),
    UNCOMMON(15),
    RARE(10),
    EPIC(5),
    LEGENDARY(1)
}

data class Item(val Name: String, val damage: Int, val rarity: ItemRarity)