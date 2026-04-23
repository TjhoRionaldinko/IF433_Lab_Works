package oop_133486_Tjho_Rionaldinko.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as String) {
            "API INVALID: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as String) {
            "API INVALID: Missing name"
        }

        val type = rawJson["type"] as? String
        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                return Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                return Product.Clothing(id, name, size)
            }
            else -> null
        }
    }
    fun checkout(product: Product) {
        val id = when (product) {
            is Product.Electronic -> {
                println("${product.name} (Warranty ${product.warrantyMonths})")
            }
            is Product.Clothing -> {
                println("${product.name} (Size ${product.size})")
            }
        }
    }
}