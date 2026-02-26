package oop_133486_Tjho_Rionaldinko.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
    // coment codenya sudah di hapus dari awal jadi saya selesaikan checkpoint 6 menggunakkan komentar
}