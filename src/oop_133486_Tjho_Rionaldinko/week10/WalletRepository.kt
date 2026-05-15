package oop_133486_Tjho_Rionaldinko.week10

class WalletRepository<T: Any> {
    private val items = mutableListOf<T>()
    fun add(item: T) = items.add(item)
    fun getAll(): List<T> = return items

    fun pencarian(items: List<T>): List<T> {
        return items.filter {it == items }
    }
}