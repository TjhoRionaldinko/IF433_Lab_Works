package oop_133486_Tjho_Rionaldinko.week01

fun main() {
    val gameTitle = "R.E.P.O."
    val price = 100000
    val discount = calculateDiscount(price)

    println("Game: $gameTitle")
    println("Price: $price")
}

fun calculateDiscount(price: Int)= if(price > 500000) price * 20 / 100 else price * 10 / 100