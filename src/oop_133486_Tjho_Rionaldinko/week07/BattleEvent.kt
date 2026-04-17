package oop_133486_Tjho_Rionaldinko.week07

sealed class BattleState () {
    data class MonsterEncounter(val monsterName: String): BattleState()
    data class LootDropped(val item: String): BattleState()
    data class GameOver(val reason: String): BattleState()
    object SafeZone: BattleState()
}