package oop_133486_Tjho_Rionaldinko.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}