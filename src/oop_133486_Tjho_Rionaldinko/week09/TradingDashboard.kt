package oop_133486_Tjho_Rionaldinko.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 8.3, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 3.1, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 10, -2.5, "OPEN"),
        TradeLog("ADAUSDT", "SHORT", 8, 6.7, "CLOSED")
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
    val winingTrades = closedTrades
        .filter { it.roe > 0 }
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    val topPerformersString = winingTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: -${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map {
            {it.pair}
        }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("\nProfit")
    topPerformersString.forEach { println(it) }

    println("\nLoss")
    worstPerformersString.forEach { println(it) }
}