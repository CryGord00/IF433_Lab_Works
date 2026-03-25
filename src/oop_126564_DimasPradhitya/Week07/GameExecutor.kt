package oop_126564_DimasPradhitya.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Muncul monster: ${event.monsterName}")
        is BattleState.LootDropped -> println("Hore! Dapat item: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        BattleState.SafeZone -> println("Kamu memasuki area aman. Silakan beristirahat.")
    }
}