package oop_133486_Tjho_Rionaldinko.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}