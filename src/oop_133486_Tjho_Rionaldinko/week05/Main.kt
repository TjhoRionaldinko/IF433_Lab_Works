package oop_133486_Tjho_Rionaldinko.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------")
    }
    println("=== MathHelper ===")
    val math = MathHelper()
    println("Luas Persegi sisi : ${math.hitungLuas(10)}")
    println("Luas Persegi Panjang : ${math.hitungLuas(7, 10)}")
    println("Luas Lingkaran : ${math.hitungLuas(5.0)}")

    println("=== Credit Card System ===")
    val ewallet = EWallet("Asep", 50000.0)
    val credit = CreditCard("Udin", 100000.0)

    val method: List<PaymentMethod> = listOf(ewallet, credit)

    for (payment in method) {
        if (payment is EWallet) {
            payment.topUp(50000.0)
        }
        payment.processPayment(75000.0)
    }
}
