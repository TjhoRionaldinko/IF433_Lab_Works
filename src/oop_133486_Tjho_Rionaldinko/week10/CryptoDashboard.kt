package oop_133486_Tjho_Rionaldinko.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 10000.0))
    coinRepo.add(Coin("ETH", 20000.0))
    coinRepo.add(Coin("USDT", 30000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach { println("Coin: ${it.name} \nBalance: ${it.balance}") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("A1", 1.0))
    txRepo.add(Transaction("A2", 2.0))
    txRepo.add(Transaction("A3", 3.0))
}

// Hasil :
//Coin: BTC
//Balance: 10000.0
//Coin: ETH
//Balance: 20000.0
//Coin: USDT
//Balance: 30000.0