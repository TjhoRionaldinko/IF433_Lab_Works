package oop_133486_Tjho_Rionaldinko.week01

fun main() {
    val gameTitle = "GTA V"
    val price = 1000000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote : String? = null

    printReceipt(
        title = gameTitle,
        price = price,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int)= if(price > 500000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String?) {
    println("Title: $title")
    println("Price: $price")
    println("Final Price: $finalPrice")
    println("Note : ${note ?: "Tidak ada catatan"}")
}