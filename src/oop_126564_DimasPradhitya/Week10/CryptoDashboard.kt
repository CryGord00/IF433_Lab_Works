package oop_126564_DimasPradhitya.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== DASHBOARD CRYPTO ===")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Aset: ${coin.name} | Saldo: ${coin.balance}")
    }
}