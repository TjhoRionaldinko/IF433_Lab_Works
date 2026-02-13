package oop_133486_Tjho_Rionaldinko.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int
){
    fun calculateFine(): Int {
        return if(loanDuration > 3){
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}