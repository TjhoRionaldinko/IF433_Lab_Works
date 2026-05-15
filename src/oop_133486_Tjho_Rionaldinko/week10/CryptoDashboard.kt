package oop_133486_Tjho_Rionaldinko.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 10000.0))
    coinRepo.add(Coin("ETH", 20000.0))
    coinRepo.add(Coin("USDT", 30000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

}

